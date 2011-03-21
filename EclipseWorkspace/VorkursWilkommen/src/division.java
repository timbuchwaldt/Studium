
public class division {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,e,r;
		
		System.out.println("Bitte Zahl A eingeben:");
		a = SimpleIO.getDouble();
		System.out.println("Bitte Zahl B eingeben:");
		b = SimpleIO.getDouble();
		System.out.println("a="+a+" b="+b);
		e = a/b;
		r = a%b;
		System.out.println("Ergebnis: "+e+ "  Rest: "+r);
	}

}
