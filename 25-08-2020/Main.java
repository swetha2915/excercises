package swethu;
import java.util.Scanner;
 class Venue {
	
	String name;
	String city;
	
		public void setName(String name)
		{
			this.name=name;
		}
	  public void setCity(String city)
	  {
		this.city=city;
	  }
	public void display()
	{
		System.out.println("Venue Details : ");
		System.out.println("Venue Name:"+name);
		System.out.println("City name :"+city);
	}
}
public class Main {

	public static void main(String[] args) {
		Venue v=new Venue();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the venue name :");
    	v.setName(sc.nextLine());
    	System.out.println("Enter the city name : ");
    	v.setCity(sc.nextLine());
    	v.display();

	}

}
