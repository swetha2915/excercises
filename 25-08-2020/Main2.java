package swethu;
class Delivary {
	
	Long over;
	Long balls;
	Long runs;
	String batsman;
	String bowler;
	String nonStriker;
	Delivary(long over ,long balls,long runs,String batsman,String bowler,String nonStriker)
	{
		this.over=over;
		this.balls=balls;
		this.runs=runs;
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
	}
	public void displayDelivaryDetails()
	{
		System.out.println("Delivery Details : ");
		System.out.println("Over :"+over);
		System.out.println("Ball :"+balls);
		System.out.println("Runs :"+runs);
		System.out.println("Batsman :"+batsman);
		System.out.println("Bowler :"+bowler);
		System.out.println("NonStriker :"+nonStriker);
	}

}

public class Main2 {

	public static void main(String[] args) {
		
		Delivary d=new Delivary(1L,1L,4L,"MS Dhoni","Dale steyn ","Suresh Raina ");
		
		d.displayDelivaryDetails();
		
		

	}

}
