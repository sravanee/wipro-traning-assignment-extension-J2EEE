import java.util.Scanner;
import java.util.Arrays;
class Assignment2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		char []arr=str.toCharArray();
		Arrays.parallelSort(arr);
		System.out.println(arr);
		
		
	}
}