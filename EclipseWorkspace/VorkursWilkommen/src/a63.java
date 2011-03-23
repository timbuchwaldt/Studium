public class a63{
	public static long facu(int a){
		if(a==0)
			return 1;
		else
			return a*facu(a-1);
	}
	public static void main(String args[]){
		System.out.println("Bitte geben Sie die Zahl ein von der die Fakultät berechnet werden soll:");
		int a = SimpleIO.getInt();
		System.out.println("Fakultät: "+facu(a));
	}
}