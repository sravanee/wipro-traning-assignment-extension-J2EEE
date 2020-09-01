import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

class Assignment7{
	public static void main(String []args){
		
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(64);
		arrList.add(39);
		arrList.add(47);
		arrList.add(20);
		arrList.add(169);
		arrList.add(10);
		arrList.add(25);
		arrList.add(98);
		arrList.add(28);
		arrList.add(86);
		
		Predicate<Integer> p=i->i%2==0;
		
		Consumer<ArrayList<Integer>> c= all->all.forEach(i->System.out.println(i+(p.test(i)?" even":" odd")));
		//another way without Predicate
		//Consumer<ArrayList<Integer>> c= all->all.forEach(i->System.out.println(i+(i%2==0?" even":" odd")));
		
		c.accept(arrList);
		
	}
}