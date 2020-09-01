import java.time.LocalDate;
import  java.time.temporal.TemporalAdjusters;
import  java.time.DayOfWeek;
class Assignment2{
	public static void main(String []args){
		
		LocalDate secondSunday=LocalDate.now().plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println(secondSunday);
		
	}
}