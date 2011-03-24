/*
 * Java data pretty printer
 *
 * Copyright (C) 2001 by Sam Steingold
 * GNU General Public License v2 (GPL2) is applicable:
 * You may use, modify and redistribute this code under the same conditions.
 * You must read the full text of the license
 * at <URL:http://www.gnu.org/copyleft/>
 *
 * $Id: Jpp.java,v 1.2 2001/02/15 22:41:28 sds Exp $
 * $Source: /usr/local/cvs/sds/java/Jpp.java,v $
 */

import java.lang.reflect.*;

/**
 * <strong>Java Pretty Printer</strong>
 *
 * This prints your Java data (objects and arrays) in a nice way,
 * even if you did not bother to implements the proper
 * <code>toString()</code> methods.
 *
 * We use the <code>toString()</code> method for those classes that
 * define it themselves, so you can mix this with your own printers.
 *
 * Note that Lisp has a pretty printer built in,
 * so you can see your data right away!
 */
public class Jpp {
  /** return the string of spaces of the given length */
  private static String pad (int width) {
    char[] buf = new char[width];
    java.util.Arrays.fill(buf,' ');
    return new String(buf);
  }

  /** pretty-print an array into a string as <code>#(...)</code> */
  private static String list_vec (Object obj,int offset) {
    if (offset>=0) offset++;
    Class type = obj.getClass();
    if (!type.isArray()) return "#<not an array: [\""+obj+"\"]>";
    String ret = "(";
    for (int ii=0; ii<java.lang.reflect.Array.getLength(obj); ii++) {
      Object elt = java.lang.reflect.Array.get(obj,ii);
      String elt_str = (elt == null ? "#<null>" :
                        (elt.getClass().isArray() ?
                         list_vec(elt,offset) : print_object(elt,offset)));
      if (ii==0) ret += elt_str;
      else if ((elt_str.indexOf('\n') > 0) ||
               ((elt_str.length() + ret.length() - ret.lastIndexOf('\n') > 78)
                && (offset >= 0)))
        ret += "\n"+pad(offset)+elt_str;
      else ret += " "+elt_str;
    }
    return ret+")";
  }

  /** pretty-print the class object <code>type</code> to a string */
  private static String print_class (Class type)
  { return print_class(type,null,null); }
  /** pretty-print the class object <code>type</code> to a string,
      <code>obj</code> is an instance of <code>type</code>
      (needed only when printing array types) */
  private static String print_class (Class type,Object obj)
  { return print_class(type,obj,null); }
  /** pretty-print the class object <code>type</code> to a string,
      <code>obj</code> is an instance of <code>type</code>
      (needed only when printing array types);
      <code>dims</code> is the other dimentions already collected */
  private static String print_class (Class type,Object obj,String dims) {
    if (!type.isArray()) return type.getName();
    Class comp = type.getComponentType();
    int len = (obj == null ? -1 : Array.getLength(obj));
    dims = (dims==null?"":dims) + (len < 0 ? "[]" : "["+len+"]");
    if (comp.isArray())
      return print_class(comp,len>0?Array.get(obj,0):null,dims);
    else return comp.getName()+dims;
  }

  /** does this class define its own <code>toString()</code> method? */
  private static boolean printed_natively_p (Class type) {
    try { type.getDeclaredMethod("toString",null); return true; }
    catch (Exception e) { return false; }
  }

  /** print the object nicely */
  public static String print_object (Object obj)
  { return print_object(obj,0); }
  /** print the object nicely; with the given offset */
  public static String print_object (Object obj,int offset) {
    offset += 2;
    if (obj == null) return "#<null>";
    Class type = obj.getClass();
    if (obj instanceof String) return "\""+obj+"\"";
    else if (printed_natively_p(type)) return obj.toString();
    else if (type.isArray()) return "#"+list_vec(obj,offset-1);
    else {
      Field[] slots = type.getFields();
      String ret = "#<["+type.getName()+"]";
      for (int ii=0; ii<slots.length; ii++) {
        ret += "\n"+pad(offset)+"["+slots[ii].getName()+" ";
        Class slot_type = slots[ii].getType();
        Object value = null;
        try { value = slots[ii].get(obj); }
        catch (IllegalAccessException iae) { value = iae; }
        if (slot_type.isPrimitive())
          ret += slot_type+" "+value;
        else
          ret += "{"+print_class(slot_type,value)+"}"+
            (printed_natively_p(slot_type) ? " ["+value+"]" :
             "\n"+pad(offset+1)+print_object(value,offset+1));
        ret += "]";
      }
      return ret+">";
    }
  }
}