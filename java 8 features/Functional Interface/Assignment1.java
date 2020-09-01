import java.util.function.Function;
import java.util.ArrayList;

class Employee{
	private int empNo;
	private String name;
	private int age;
	private String location;
	
	Employee(int empNo,String name,int age,String location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	String getLocation(){
		return location;
	}
	public String toString(){
		return "Employee No: "+empNo+" name="+name+" age="+age+" location="+location;
	}
	
}

class Assignment1{
	public static void main(String []args){
		
		ArrayList<Employee> arrList=new ArrayList<>();
		arrList.add(new Employee(101,"Sachin",35,"Jaipur"));
		arrList.add(new Employee(102,"Kohli",40,"Pune"));
		arrList.add(new Employee(103,"Dhoni",30,"Ranchi"));
		arrList.add(new Employee(104,"Raina",25,"Kanpur"));
		arrList.add(new Employee(105,"Rahul",29,"Lucknow"));
		Function<ArrayList<Employee>,ArrayList<String>> f= ( all )-> {
			ArrayList<String> locations=new ArrayList<>();
			for(Employee e: all){
				locations.add(e.getLocation());
			}
			return locations;};
		System.out.println(f.apply(arrList));
		
		
	}
}