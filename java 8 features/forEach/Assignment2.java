
import java.util.ArrayList;

class Employee{
	private int id;
	private String name;
	private String address;
	private double salary;
	Employee(int id,String name,String address,double salary){
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;		
	}
	public void printdetails(){
		System.out.println("Employee Deatails:- Id="+id+" name="+name+" address="+address+" salary="+salary);
	}
}
class Assignment2{
	public static void main(String []args){
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(1,"Rohan","Jaipur",50000.0));
		al.add(new Employee(2,"Mohan","Varanasi",60000.0));
		al.add(new Employee(3,"kanhaiya","Mathura",40000.0));
		al.add(new Employee(4,"Naveen","Jaipur",40000.0));
		al.add(new Employee(5,"Pawan","Delhi",50000.0));
		al.forEach(e->e.printdetails());
	}
}