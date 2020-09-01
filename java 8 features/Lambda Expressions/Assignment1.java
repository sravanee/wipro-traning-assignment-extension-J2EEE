import java.util.ArrayList;
import java.util.Random;
class Assignment1{
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<Integer>();
		Random rd=new Random();
		
		for(int i=0;i<25;i++){
			al.add(rd.nextInt(1000));
		}
		al.forEach(n->{
			int flag=0;
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					flag=1;
					break;
				}			
			}
			if(flag==0){
			System.out.println(n);
			}
		}
		);
	}
}