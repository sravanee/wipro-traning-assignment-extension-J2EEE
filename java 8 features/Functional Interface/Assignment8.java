import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Predicate;

class Assignment8{
	public static void main(String []args){
		
		Predicate<Integer> p=num->{
			for(int i=2;i<=Math.sqrt(num);i++){
				if(num%i==0){
					return false;
				}
			}
			return true;
		};
		Supplier<ArrayList<Integer>> s=()->{
			ArrayList<Integer> res=new ArrayList<>();
			int count=0,i=2;;
			
			while(count<10){
				if(p.test(i)){
					res.add(i);
				    count++;
				}
				i++;
			}
			return res;
		};
	
		System.out.println(s.get());	
	}
}