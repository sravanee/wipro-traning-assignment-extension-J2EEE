
import java.util.Optional;
class Assignment3{
	
	public static void main(String []args) throws Exception{
		
		Employee e=new Employee();
		e=null;
		Optional<Employee> n=Optional.ofNullable(e);
		
		System.out.println(n.orElseThrow(()->new InvalidEmployeeException("InvalidEmployeeException has occured")));
		
	}
}