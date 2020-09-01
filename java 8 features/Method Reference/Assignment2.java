interface MyReference{
	int dCount(int n);
	
}

class Assignment2{
	static int digitCount(int n){
		
		return (int)Math.log10(n)+1;
	}
	public static void main(String []args){
		
		MyReference ref=Assignment2::digitCount;
		
		System.out.println(ref.dCount(1727));
		
	}
}