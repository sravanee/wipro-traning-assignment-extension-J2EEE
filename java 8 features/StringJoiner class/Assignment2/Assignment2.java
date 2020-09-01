
import java.util.StringJoiner;
class Assignment2{
	public static void main(String []args){
		StringJoiner sj1=new StringJoiner("-");
		
		sj1.add("Jaipur");
		sj1.add("Delhi");
		sj1.add("Patna");
		StringJoiner sj2=new StringJoiner("-");
		sj2.add("Lucknow");
		sj2.add("Noida");
		sj2.add("Pune");
		
		System.out.println(sj1.merge(sj2));
		
		
	}
}