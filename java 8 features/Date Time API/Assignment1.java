import java.time.LocalDate;
class Assignment1{
	public static void main(String []args){
		LocalDate date=LocalDate.now();
		System.out.println("Todays date: "+date );
		System.out.println("Date after ten days : "+date.plusDays(10) );
		
	}
}