public class a42{
	public static void main(String args[]){
		boolean cont = true ;
		int choice, max,i;
		do{
		System.out.print("===== Studenten-Verwaltung ===== \n(1) Anzahl der Studenten eingeben \n(2) Programm beenden \nIhre Auswahl:\n");
		choice = SimpleIO.getInt();
		if (choice == 1){
			System.out.println("Bitte Zahl der Studenten eingeben");
			max = SimpleIO.getInt();
			String studenten[][] = new String[max][2];
			for(i = 0; i<max;i++){
				System.out.println("Bitte Name eingeben:");
				studenten[i][0] = SimpleIO.getString();
				System.out.println("Bitte Mat.Nr. eingeben:");
				studenten[i][1] = SimpleIO.getString();
			}
			System.out.println("Danke, alle Studenten wurden erfasst");
			for(i = 0; i<max;i++){
				System.out.println("##################################");
				System.out.println("Mat.Nr: "+studenten[i][1]);
				System.out.println("Name  : "+studenten[i][0]);
			} 
			cont = true;
		}else{
			cont = false;
		};
		}while(cont == true);
	}
}