interface MyReference{
	int fact(int n);
	
}

class Assignment1{
	int factorial(int n){
		int f=1;
		for(int i=2;i<=n;i++){
			f*=i;
		}
		return f;
	}
	public static void main(String []args){
		Assignment1 a=new Assignment1();
		MyReference ref=a::factorial;
		MyReference ref1=new Assignment1()::factorial;
		
		System.out.println(ref.fact(5));
		System.out.println(ref1.fact(5));
	}
}