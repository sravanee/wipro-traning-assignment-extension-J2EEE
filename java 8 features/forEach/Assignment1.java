import java.util.ArrayList;
class Assignment1{
	public static void main(String []args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.forEach(System.out::println);
	}
}