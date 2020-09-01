import java.util.function.Predicate;
import java.util.ArrayList;
class Assignment3{
	public static void main(String []args){
		
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(1);
		arrList.add(55);
		arrList.add(404);
		arrList.add(212);
		arrList.add(61216);
		arrList.add(1001);
		arrList.add(251);
		arrList.add(345);
		arrList.add(123);
		arrList.add(262);
		
		Predicate<Integer> p= i->{
			int rev=0,temp=i;
			
			while(temp>0){
				rev=rev*10+(temp%10);
				temp/=10;
			}
			if(rev==i){
				return true;
			}else{
				return false;
			}
		};
		ArrayList<Integer> res=new ArrayList<>();
		arrList.forEach(
		i->{if(p.test(i))res.add(i);}
		);
		
		System.out.println(res);
		
		
	}
}