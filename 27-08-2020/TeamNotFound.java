package swethu;
import java.util.Scanner;
class TeamNotFoundException extends Exception{
	TeamNotFoundException(String a)
	{
		super(a);
	}
	
}

public class TeamNotFound {
	static void display(String winner,String runner) {
		System.out.println("Expected IPL Season 4 winner:"+winner);
		System.out.println("Expected IPL Season 4 runner: "+runner);
	}
	

	public static void main(String[] args) {
		int count=0;
		
		String [] str= {"Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expected winner team of IPL Season 4");
        String winnerTeam=sc.nextLine();
        System.out.println("Enter the expected runner Team of IPL Season 4");
        String runnerTeam=sc.nextLine();
        for(int i=0;i<str.length;i++)
        {
        	try
        	{
        		if(str[i].equals(winnerTeam)||str[i].equals(runnerTeam))
        		{
        			
        			display(winnerTeam,runnerTeam);
        			break;
        			
        		}
        		else
        		{
        			throw new TeamNotFoundException("Entered team is not a part of IPL Season 4");
        		}
        	}
        	catch(TeamNotFoundException e)
        	{
        		System.out.println(e);
        		break;
        	}
        	
        }
	}

}
