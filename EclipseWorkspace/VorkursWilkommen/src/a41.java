
public class a41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num,sum,x;
		System.out.println("Wie viele Zahlen wollen Sie eingeben?");
		num = SimpleIO.getInt();
		sum = 0;
		for(x=0;x<num;x++){
			System.out.println("Bitte geben Sie eine weitere Zahl ein");
			sum += SimpleIO.getInt();
		}
		System.out.println("Schnitt:" + (sum/num));
	}

}
