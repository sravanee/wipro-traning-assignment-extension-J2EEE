import java.util.Arrays;
class Assignment1{
	public static void main(String []args){
		int arr[]={3,1,6,7,4,9,28,12,15,5};
		System.out.println("Arrays Element");
		for(int i:arr){
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr);
		System.out.println("\nSum of max and min element:"+arr[0]+arr[9]);		
	}
}