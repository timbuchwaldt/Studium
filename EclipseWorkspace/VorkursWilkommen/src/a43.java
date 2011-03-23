public class a43{
	public static void main(String args[]){
		int toSort,i,swap;
		boolean sorted = false;
		System.out.println("Bitte geben Sie die gewünschte Menge der zu sortierenden Zahlen ein:");
		toSort = SimpleIO.getInt();
		int arr[] = new int[toSort];
		for (i=0;i<toSort;i++){
			System.out.println("Bitte geben Sie eine Zahl an");
			arr[i] = SimpleIO.getInt();
		}
		while(!sorted){
			//Sort-run, swapping bigger for smaller elements
			sorted = true;
			
			for(i=1;i<toSort;i++){
				if(arr[i]<arr[i-1]){
					swap = arr[i];
					arr[i] = arr[i-1];
					arr[i-1]=swap;
					sorted = false;
				}
				
			}
			}
			System.out.println("################");
		
		for(i=0;i<toSort;i++){
			System.out.println(arr[i]);
		}
	}
}