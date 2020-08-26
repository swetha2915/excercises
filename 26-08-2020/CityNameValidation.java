package swethu;
import java.util.Scanner;
public class CityNameValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city name :");
		String cityName=sc.nextLine();
		int length=cityName.length();
		
		System.out.println(validateCity(cityName,length));

	}
	
	static String validateCity(String name,int l) {
		if((name.charAt(0)!='*' && name.charAt(1)!='*')&& (name.charAt(l-1)!='*' && name.charAt(l-2)!='*'))
			{
			    return "valid";
			}
		else
		{
			return "invalid";
		}
		
	}

	

}
