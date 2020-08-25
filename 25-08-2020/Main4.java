package swethu;
import java.util.Scanner;
class Venue1{
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
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}
}
public class Main4 {

	public static void main(String[] args) {
		Venue1 v=new Venue1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name :");
		v.setName(sc.nextLine());
		System.out.println("Enter the city name :");
		v.setCity(sc.nextLine());
		System.out.println("venue name:"+v.getName());
		System.out.println("city name:"+v.getCity());

	}

}
