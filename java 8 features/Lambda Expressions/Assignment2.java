import java.util.ArrayList;
class Assignment2{
	public static void main(String []args){
		ArrayList<StringBuffer> al=new ArrayList<StringBuffer>();
		al.add(new StringBuffer("Wipro"));
		al.add(new StringBuffer("Technologies"));
		al.add(new StringBuffer("Java"));
		al.add(new StringBuffer("Python"));
		al.add(new StringBuffer(".net"));
		al.add(new StringBuffer("Php"));
		al.add(new StringBuffer("JavaScript"));
		al.add(new StringBuffer("JQuery"));
		al.add(new StringBuffer("Html"));
		al.forEach(s->System.out.println(s.reverse()));
	
	}
}