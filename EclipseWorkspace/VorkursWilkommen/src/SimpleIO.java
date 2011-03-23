/*******************************************************/
/* Klasse fuer die vereinfachte Ein- und Ausgabe ueber */
/* die System-Konsole (angelehnt an SIO-Modul von M3)  */
/*                                                     */
/* Informatik Vorkurs 2002, RWTH Aachen                */
/*                                                     */
/* Autor:            Achim Luecking                    */
/*                   fuer LuFGI3, RWTH Aachen          */
/*                                                     */
/* Erstellt:         18.09.2001                        */
/* Letzte Aenderung: 10.10.2001                        */
/*******************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public final class SimpleIO {
	/* BufferedReader fuer den InputStream aus der */
	/* der Konsole, verwendet fuer die Eingabe */
	private static BufferedReader konsole = new BufferedReader(
			new InputStreamReader(System.in));

	/* Konstanten fuer Fehlermeldungen */
	private static final String IOError = "FEHLER: bei der Eingabe!";
	private static final String ChError = "FEHLER: leere Char-Eingabe!";
	private static final String NFError = "FEHLER: keine Zahl oder Zahl im falschen Format eingegeben!";

	/* allgemeine Methoden */

	public static int[] getRandomIntArray() {
		Random r = new Random();
		int[] randomArray = new int[(r.nextInt(100) % 10)];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (r.nextInt(100) % 100);
		}
		return randomArray;
	}

	public static int getInt() {
		/* Liest einen Int-Wert von der Konsole ein und gibt */
		/* diesen an die aufrufende Klasse/Methode zurueck */
		/* Im Falle einer fehlerhaften Eingabe wird die Zahl 0 */
		/* zurueckgeliefert und eine Fehlermeldung ausgegeben. */

		int zahl = 0;
		try {
			zahl = java.lang.Integer.parseInt(konsole.readLine());
		}
		// Faengt die IO-Fehler der Methode readLine() auf
		catch (IOException e) {
			System.out.println(IOError);
		}
		// Faengt die Exception der Methode parseInt auf;
		// es wurden keine als Integer interpretierbaren
		// Werte eingegeben
		catch (NumberFormatException e) {
			System.out.println(NFError);
		}
		return zahl;
	}

	public static double getDouble() {
		/* Liest einen Double-Wert von der Konsole ein und gibt */
		/* diesen an die aufrufende Klasse/Methode zurueck */
		/* Im Falle einer fehlerhaften Eingabe wird die Zahl 0 */
		/* zurueckgeliefert und eine Fehlermeldung ausgegeben. */

		double zahl = 0;
		try {
			zahl = java.lang.Double.parseDouble(konsole.readLine());
		}
		// Faengt die IO-Fehler der Methode readLine() auf
		catch (IOException e) {
			System.out.println(IOError);
		}
		// Faengt die Exception der Methode parseInt auf;
		// es wurden keine als Double interpretierbaren
		// Werte eingegeben
		catch (NumberFormatException e) {
			System.out.println(NFError);
		}
		return zahl;

	}

	public static String getString() {
		/* Liest einen String von der Konsole ein und gibt */
		/* diesen an die aufrufende Klasse/Methode zurueck. */
		/* Im Falle einer fehlerhaften Eingabe, wird der */
		/* leere String zurueck gegeben. */

		String zeile = "";
		try {
			zeile = konsole.readLine();
		}
		// Faengt die IO-Fehler der Methode readLine() auf
		catch (IOException e) {
			System.out.println(IOError);
		}
		return zeile;
	}

	public static char getChar() {
		/* Liest ein Character von der Konsole ein und gibt */
		/* diesen an die aufrufende Klasse/Methode zurueck. */
		/* Im Falle einer fehlerhaften Eingabe wird das leere */
		/* Character zurueckgegeben. */
		/* Wird mehr, als nur ein Zeichen eingegeben, so wird */
		/* nur das erste Zeichen beruecksichtigt. */

		char zeichen = '\u0000';
		String zeile = "";
		try {
			zeile = konsole.readLine();
			if (zeile.length() > 0) {
				zeichen = zeile.charAt(0);
			} else {
				System.out.println(ChError);
			}
		}
		// Faengt die IO-Fehler der Methode readLine() auf
		catch (IOException e) {
			System.out.println(IOError);
		}
		return zeichen;
	}
}
