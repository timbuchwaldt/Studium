
public class a32c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b;
		System.out.println("Bitte Zahl 1 eingeben");
		a = SimpleIO.getInt();
		System.out.println("Bitte Zahl 2 eingeben");
		b = SimpleIO.getInt();
		if(a==5){
			if(b==5){
				System.out.println("A und B sind = 5");
			}else{
				System.out.println("Nur A ist = 5");
			}
		}else if (b==5){
			System.out.println("Nur B ist = 5");
		}else{
			System.out.println("Weder A noch B ist = 5");
		}
	}

}
