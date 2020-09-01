import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
	private int id;
	private String name;
	private double salary;
	 Employee(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}


class Assignment4{
	public static void main(String []args){
		
		ArrayList<Employee> arrList=new ArrayList<>();
		arrList.add(new Employee(101,"Sachin",20000));
		arrList.add(new Employee(102,"Kohli",5000));
		arrList.add(new Employee(103,"Dhoni",58000));
		arrList.add(new Employee(104,"Raina",97000));
		arrList.add(new Employee(105,"Rahul",40000));
		arrList.add(new Employee(104,"Rohit",9800));
		arrList.add(new Employee(105,"Mohit",9000));
		
		Predicate<Double> p= i->i<10000;
		ArrayList<String> res=new ArrayList<>();
		arrList.forEach(
		i->{if(p.test(i.getSalary()))res.add(i.getName());}
		);
		
		System.out.println(res);
		
		
	}
}