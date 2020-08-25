package swethu;

class Player1 {
	String name;
	String country;
	String skill;
	

}

public class Main3 {

	public static void main(String[] args) {
		Player1 p=new Player1();
		String str="MS Dhoni,India,All Rounder ";
		String names[]=str.split(",");
		String first=names[0];
		String second=names[1];
		String third=names[2];
		System.out.println("Player Details :");
		System.out.println("Player name:"+names[0]);
		System.out.println("Country name:"+names[1]);
		System.out.println("skill:"+names[2]);
		
	}


}

