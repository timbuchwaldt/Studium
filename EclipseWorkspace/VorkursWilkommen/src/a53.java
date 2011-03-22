public class a53 {
	public static void main(String[] args) {
		String z;
		System.out.println("Bitte String eingeben");
		z = SimpleIO.getString();
		z = z.replace('a', 'o').replace('e', 'o').replace('i','o').replace('u', 'o');
		System.out.println(z);
	}
}
