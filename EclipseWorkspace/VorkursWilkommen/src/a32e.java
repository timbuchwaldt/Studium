
public class a32e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int  choice;
		double result,input;
		// TODO Auto-generated method stub
		System.out.print("== Einheitenkonvertierung == \n (1) Celsius -> Fahrenheit \n (2) Fahrenheit -> Celsius \n Bitte w�hlen:");
		choice = SimpleIO.getInt();
		if (choice == 1){
			System.out.println("Bitte Den Wert in �C eingeben: ");
			input = SimpleIO.getDouble();
			result = input * 1.8 + 32;
			System.out.println(result);
		}else if(choice == 2){
			System.out.println("Bitte Den Wert in �F eingeben: ");
			input = SimpleIO.getDouble();
			result = (input - 32)/1.8;
			System.out.println(result);
		}else{
			System.out.println("ung�ltige Eingabe");
		}
	}

}
