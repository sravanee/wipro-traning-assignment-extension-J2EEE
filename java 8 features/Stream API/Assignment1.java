import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
class Assignment1{
	public static void main(String []args){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(-8);
		list.add(-5);
		list.add(6);
		list.add(-12);
		List<Integer> res=list.stream().filter(x->(x<0 && x%2==0)).collect(Collectors.toList());
		System.out.println(res);
		
	}
}