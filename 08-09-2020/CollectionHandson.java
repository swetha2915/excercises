package collectionshandson;
import java.util.*;
import java.util.Scanner;

public class CollectionHandson {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<>(n);
		for(int i=0;i<n;i++)
		{
		li.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i++)
		{
			
	     if((i+1)%2==0)
	     {
	    	 sum=sum+li.get(i);
	     }
		
		}
		
	
		
		System.out.println(sum);
}
}
