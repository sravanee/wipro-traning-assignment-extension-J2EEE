@FunctionalInterface
interface Test{
	int myFunction(int a,int b,int c);
}

class Assignment2{
	public static void main(String []args){
		Test t1=(x,y,z)->(x+y+z);
		Test t2=(x,y,z)->(x*y*z);
		System.out.println(t1.myFunction(10,20,30));
		System.out.println(t2.myFunction(10,20,30));
	}
}
