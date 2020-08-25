package swethu;
import java.util.Scanner;
 class Player{
	String name;
	String country;
	String skill;
	
		public void setName(String name) {
			this.name=name;
		}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public void setSkill(String skill)
	{
		this.skill=skill;
	}
	public void display()
	{
		System.out.println("Player Details : ");
		System.out.println("Player Name:"+name);
		System.out.println("Country name :"+country);
		System.out.println("skill:"+skill);
	}
 }
public class Main1 {
	
	public static void main (String args[]) {
    	
        Player p=new Player();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the player name :");
        p.setName(sc.nextLine());
    	System.out.println("Enter the player country name : ");
    	p.setCountry(sc.nextLine());
    	System.out.println("Enter the skill :");
    	p.setSkill(sc.nextLine());
    	p.display();
    
    	
    	
    	
    	
                
                
} 
}
	

		         

		
		

        
	


