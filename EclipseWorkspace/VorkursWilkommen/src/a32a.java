
public class a32a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b;
		// TODO Auto-generated method stub
		System.out.println("Bitte Zahl 1 eingeben");
		a = SimpleIO.getInt();
		System.out.println("Bitte Zahl 2 eingeben");
		b = SimpleIO.getInt();
		if (a>b) {
			System.out.println("Zahl 1 ist gr��er als Zahl 2");
		}else if(a<b){
			System.out.println("Zahl 2 ist gr��er als Zahl 1");
		}else{
			System.out.println("Die beiden Zahlen sind gleich gro�!");

		}
	}

}