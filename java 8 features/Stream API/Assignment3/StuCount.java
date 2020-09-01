import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
class StuCount{
	public static void main(String  []args){
		ArrayList<Student> arrList=new ArrayList<>();
		arrList.add(new Student(101,"Sachin",85));
		arrList.add(new Student(102,"Kohli",80));
		arrList.add(new Student(103,"Dhoni",90));
		arrList.add(new Student(104,"Raina",95));
		arrList.add(new Student(105,"Rahul",49));
		long count=arrList.stream().filter(e->e.getMark()>=50).count();
		System.out.println(count);
	
	}
}