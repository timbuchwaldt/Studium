public class a7{
	public static void main(String args[]){
		int[] zahlen = new int [args.length]; 
		int argumentIndex = 0;
		while (argumentIndex < args.length ) {
			zahlen[argumentIndex] = new Integer(args[argumentIndex]);
		argumentIndex++; };
		int even = 0;
		int odd = 0;
		int evenN[] = new int[argumentIndex];
		int oddN[] = new int[argumentIndex];
		for(int i=0;i<argumentIndex;i++){
			if(zahlen[i] % 2 ==0){
				evenN[even]= zahlen[i];
				even++;
			}else{
				oddN[odd]= zahlen[i];
				odd++;
			}
		}
		//Gerade
		System.out.println("Gerade Zahlen:");
		for(int i=0;i<even;i++){
			System.out.print(" " + evenN[i]);
		}
		System.out.println("Ungerade Zahlen:");
			for(int i=0;i<odd;i++){
				System.out.print(" " + oddN[i]);
			}
		System.out.println("");
		
	}
}