/* 
 Dieses Programm ist voller Fehler und muss korrigiert werden.
 Autor           : Thomas Weiler, RWTH Aachen
 Erstellt        : 07.04.06   
 Letzte Aenderung: 07.04.06
 */
public class ProgrammMitFehlern {

	public static void main(String args[]) {
		Integer eingabe;
		String ausgabe;

		System.out.println("Wieviele Fehler enth�lt dieses Programm?");
		System.out.print("Eingabe bitte: ");
		eingabe = SimpleIO.getInt();
		System.out.print("Dann schreiben Sie auf einem Blatt alle ");
		System.out.print (eingabe);
		System.out.println (" Fehler in folgendem Format auf!");
		System.out.print (" Nr.        Zeile          Art des Fehlers");
	}
}
