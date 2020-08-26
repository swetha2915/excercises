package swethu;
import java.util.Scanner;
public class LuckyPlayer {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the name :");
		 String playerName=sc.nextLine();
		 
		 
		 validatePlayer(playerName,"a");

	}
	
	static void validatePlayer(String name,String b) {
        String s;
		char[] name1=new char[name.length()];
		for(int i=1;i<=name.length();i++)
		{
			if(name.contains(b))
			{
                if(i%2!=0) 
                {
			            if(name1[i]=='a')
			            {
			            	System.out.println("valid");
			            	break;
			            }
				
					
                }
                else
                {
                	System.out.println("invalid");
                	break;
                }
			}
			else
			{
				System.out.println("valid");
				break;
			}
			
		}
		
		
		
	}

}
