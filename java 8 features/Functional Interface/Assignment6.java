import java.util.ArrayList;
import java.util.function.Consumer;

class Assignment6{
	public static void main(String []args){
		
		ArrayList<StringBuffer> arrList=new ArrayList<>();
		arrList.add(new StringBuffer("Sachin"));
		arrList.add(new StringBuffer("Kohli"));
		arrList.add(new StringBuffer("Dhoni"));
		arrList.add(new StringBuffer("Raina"));
		arrList.add(new StringBuffer("Rahul"));
		arrList.add(new StringBuffer("Rohit"));
		arrList.add(new StringBuffer("Mohit"));
		arrList.add(new StringBuffer("Ramesh"));
		arrList.add(new StringBuffer("Raunit"));
		arrList.add(new StringBuffer("Rakesh"));
		System.out.println(arrList);
		Consumer<ArrayList<StringBuffer>> c= all->all.forEach(i->i.reverse());
		c.accept(arrList);
		System.out.println(arrList);	
	}
}