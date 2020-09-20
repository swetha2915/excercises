package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your size :");
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<Integer>(n);
		System.out.println("Enter your input : ");
		for(int i=0;i<n;i++)
		{
			li.add(sc.nextInt());
		}
		for(int a:li)
		{
			sum+=a;
		}
		System.out.println("sum :"+sum);
		float avg=sum/n;
		System.out.println("Average :"+(avg));
		
	}

}
