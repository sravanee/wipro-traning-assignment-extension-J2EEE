

interface Vehicle{
	default void message(){
		System.out.println("Inside Vehicle");
	}		
}


interface FourWheeler{
	default void message(){
		System.out.println("Inside FourWheeler");
	}
}

class Car implements Vehicle, FourWheeler{
	public void message(){
		Vehicle.super.message();
	}
	
}

class Assignment1{
	public static void main(String []args){
		Car c=new Car();
		c.message();
	}
}