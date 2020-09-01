class Employee{
	private int empNo;
	private String name;
	private int age;
	private String location;
	
	Employee(int empNo,String name,int age,String location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.location=location;
	}
	String getLocation(){
		return location;
	}
	public String toString(){
		return "Employee No: "+empNo+" name="+name+" age="+age+" location="+location;
	}
	
}