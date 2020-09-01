@FunctionalInterface
interface WordCount{
	int count(String str);
}
class MyClassWithLambda{
	public static void main(String []args){
		WordCount ref=(s)->(s.split(" ").length);
		System.out.println(ref.count("Java 8 Feature:  Lambda expression example"));
		System.out.println(ref.count("Wipro Technologies Banglore"));
		
	}
}