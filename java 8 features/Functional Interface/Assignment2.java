import java.util.function.Function;
import java.util.ArrayList;
class Assignment2{
	public static void main(String []args){
		
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(1);
		arrList.add(5);
		arrList.add(4);
		arrList.add(2);
		arrList.add(6);
		arrList.add(10);
		arrList.add(25);
		arrList.add(34);
		arrList.add(12);
		arrList.add(26);
		
		Function<ArrayList<Integer>,Integer> f= all->{
			int sum=0;
			for(int i:all){
				sum+=i;
			}
			return sum;
		};
		
		System.out.println(f.apply(arrList));
		
		
	}
}