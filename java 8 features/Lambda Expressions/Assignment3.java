import java.util.ArrayList;
class Assignment3{
	public static void main(String []args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Wipro");
		al.add("Technologies");
		al.add("Java");
		al.add("Python");
		al.add(".net");
		al.add("Php");
		al.add("JavaScript");
		al.add("SQL");
		al.add("Html");
		al.forEach(s->{
			if(s.length()%2!=0){
				System.out.println(s);
			}
		});
	
	}
}