import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
class EmployeeDemo{
	public static void main(String  []args){
		ArrayList<Employee> arrList=new ArrayList<>();
		arrList.add(new Employee(101,"Sachin",35,"Jaipur"));
		arrList.add(new Employee(102,"Kohli",40,"Pune"));
		arrList.add(new Employee(103,"Dhoni",30,"Ranchi"));
		arrList.add(new Employee(104,"Raina",25,"Pune"));
		arrList.add(new Employee(105,"Rahul",29,"Pune"));
		List<Employee> res=arrList.stream().filter(e->e.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());
		res.forEach(x->System.out.println(x));
		
	
	}
}