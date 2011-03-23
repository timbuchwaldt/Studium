public class a62{
		public static int kgv(int a,int b){
			return a*b/a51.euclid(a,b);
		}
		public static int kgv(int[] a, int index){
			if (a.length -1 >= index +1){
				return kgv(a[index],a[index++]);
			}else{
				return kgv(a[index],kgv(a,index++));
			}
		}
		public static void main(String args[]){
		
		int arr[] = SimpleIO.getRandomIntArray();
		System.out.println(kgv(arr,0));
	}
}