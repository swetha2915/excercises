package swethu;
import java.util.Scanner;
public class dateValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date :");
		String dateInput=sc.nextLine();
		System.out.println(validateDate("-",dateInput));
	}
	
	static String validateDate(String a,String b) {
		if(b.contains(a)) {
			 return "valid";
		}
		else
		{
			return "invalid";
		}
	}
		

	

}
