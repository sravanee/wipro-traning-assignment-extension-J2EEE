import java.time.LocalTime;
class Assignment5{
	public static void main(String []args){
		LocalTime time=LocalTime.now();
		System.out.println("Time: "+time );
		System.out.println("Time after 25 minutes : "+time.plusMinutes(25) );
		
	}
}