public class a51 {
	public static int euclid(int a, int b){
			if(a == 0){
				return b;
			}else{
				while (b!=0){
					if(a>b){
						a= a-b;
					}else{
						b = b-a;
					}
				}
			}
			return a;
	}
	public static void main(String[] args) {
		int a,b;
		System.out.println("Bitte Zahl 1 eingeben");
		a = SimpleIO.getInt();
		System.out.println("Bitte Zahl 2 eingeben");
		b = SimpleIO.getInt();
		int ggt = euclid(a,b);
		System.out.println(ggt);
	}
}
