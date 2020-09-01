
import java.util.Optional;
class Assignment2{
	String address;
	String default_address="India";
	public static void main(String []args){
		
		Assignment2 as=new Assignment2();
		Optional<String> n=Optional.ofNullable(as.address);
		
		System.out.println(n.orElse(as.default_address));
		
	}
}