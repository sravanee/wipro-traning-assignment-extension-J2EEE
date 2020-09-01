import java.util.Arrays;
class Assignment3{
	public static void main(String []args){
		int arr[]={3,1,6,7,4,9,28,12,15,5};
		System.out.println("Before sorting");
		for(int i:arr){
			System.out.print(i+" ");
		}
		Arrays.parallelSort(arr,0,5);
		System.out.println("\n"+"After sorting:");
		for(int i:arr){
			System.out.print(i+" ");
		}
				
	}
}