package swethu;
import java.util.Scanner;

	
class customException extends Exception{
	String name;
	int age;
	public customException(String name,int age)
	{
		this.name=name;
		this.age=age;
		try {
		if(age>=19)
		{
			System.out.println("Player name:"+name);
			System.out.println("Playerage:"+age);
		}
		else
		{
			
			throw new Exception("InvalidAgeRangeException");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	      
	      
	
	
}

public class program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name:");
		String playerName=sc.nextLine();
		System.out.println("Enter the player age:");
		int playerAge=sc.nextInt();
		customException exception=new customException(playerName,playerAge);
		
	}

	}

