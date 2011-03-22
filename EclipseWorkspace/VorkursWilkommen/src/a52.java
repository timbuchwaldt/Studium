public class a52 {
	public static void main(String[] args) {
		double n,k,sum;
		System.out.println("Bitte Zahl der Schritte eingeben:");
		n = SimpleIO.getDouble();
		sum = 0;
		for(k=1; k<=n; k = k+1 ){
			sum += 1/(k*k);
		}
		sum = Math.sqrt(sum*6);
		System.out.println(sum);
	}
}
