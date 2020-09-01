import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringJoiner;
class Assignment1{
	public static void main(String []args){
		StringJoiner sj=new StringJoiner(",","{","}");
		ArrayList<String> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++){
		list.add(sc.next());
		}
		list.forEach(s->sj.add(s));
		System.out.println(sj);
		
	}
}