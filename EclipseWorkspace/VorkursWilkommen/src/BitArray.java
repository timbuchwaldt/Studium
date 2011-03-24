public class BitArray{
	boolean[] array;
	
	public BitArray(String bitstring){
		char char_array[] = bitstring.toCharArray();
		array = new boolean[char_array.length]; //Contruct array of chars to parse
		for (int i=0;i<char_array.length;i++){
			if (char_array[i] == '0'){
				array[i] = false;
			}else{
				array[i] = true;
			}
		}
	}
	public int toInt(){
		int j=1;
		int temp=0;
		int sum = 0;
		for (int i=array.length-1;i>=0;i--){
			if (array[i]==true){
				temp = 1;
			}else{
				temp=0;
			}
			sum+= temp*(Math.pow(2,j));
			j++;
		}
		System.out.println("Sum: "+sum);
		return 1;
	}
}