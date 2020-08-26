package swethu;
import java.util.Scanner;


class Shape1{
	protected String shapeName;
	 public void Shape1(String shapeName){
		 this.shapeName=shapeName;
	 }
	 public double calculateArea()
	 {
		 return 0;
	 }
	
}
class Square1 extends Shape1{
	private int side;
	String shapeName="square";
	public int setSide(int side) {
		this.side=side;
		return side;
	}
	public double calculateArea() {
	 return side*side;
}
}
class Rectangle1 extends Shape{
	
	private int length;
	private int breadth;
	String shapeName="Rectangle";
	public int setLength(int length)
	{
		this.length=length;
		return length;
	}
	public int setBreadth(int breadth)
	{
		this.breadth=breadth;
		return breadth;
	}
	public double calculateArea() {
		
		return length*breadth;
	}
	
}
	

class Circle1 extends Shape{
	final double PI=3.14;
	private int radius;
	String shapeName="Circle";
	public int setRadius(int radius) {
		this.radius=radius;
		return radius;
	}
   public double calculateArea() {
		
		return PI*radius*radius;
	}
	
	
}

public class inheritance2  {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose a shape you want\n 1.Square \n 2.Rectangle\n 3.Circle\n");
		int number=sc.nextInt();
		if(number==1)
		{
		Square1 square=new Square1();
		System.out.println("Enter the side:");
		square.setSide(sc.nextInt());
		System.out.println(square.calculateArea());
		}
		else if(number==2)
		{
			Rectangle1 rectangle=new Rectangle1();
			System.out.println("Enter the length :");
			rectangle.setLength(sc.nextInt());
			System.out.println("Enter the breadth :");
			rectangle.setBreadth(sc.nextInt());
			System.out.println(rectangle.calculateArea());
		}
		else
		{
			Circle1 circle=new Circle1();
			System.out.println("Enter the radius :");
			circle.setRadius(sc.nextInt());
			System.out.println(circle.calculateArea());
		}
		
		
		
		

	}






	

	}


