public class a8{
	public static void main(String args[]){
		 //get_byte_arrays();
		BitArray arr = new BitArray("0");
		arr.toInt();
		BitArray arr2 = new BitArray("1");
		arr2.toInt();
		BitArray arr3 = new BitArray("10");
		arr3.toInt();
		BitArray arr4 = new BitArray("11");
		arr4.toInt();
	}
	public static void get_byte_arrays(){
		System.out.println("Bitte 1. Zahl eingeben;");
		char s1[] = SimpleIO.getString().toCharArray();
		System.out.println("Bitte 2. Zahl eingeben;");
		char s2[] = SimpleIO.getString().toCharArray();
		boolean b1[] = new boolean[s1.length];
		boolean b2[] = new boolean[s2.length];  
		for (int i=0;i<s2.length;i++){
			if (s2[i] == '0'){
				b2[i] = false;
			}else{
				b2[i] = true;
			}
		}
		for (int i=0;i<s1.length;i++){
			if (s1[i] == '0'){
				b1[i] = false;
			}else{
				b1[i] = true;
			}
		}
		for (int i=0;i< b1.length;i++){
			System.out.println("B1 "+ b1[i]);
		}
		for (int i=0;i< b2.length;i++){
			System.out.println("B2 "+ b2[i]);
			
		}
	}
	public static boolean[] binAdd(boolean a, boolean b,boolean u){
		boolean test[]= new boolean[2];
		test[0]= ((a||b||u)||(a&&b&&u));
		test[1] = (u&&!(a^b));
		return test;
	}
}