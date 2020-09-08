package collectionshandson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collectionhandson1 {
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
			if(li.get(i)%2==0 && (i+1)%2==1 || li.get(i)%2==1 && (i+1)%2==0)
			{
				sum=sum+li.get(i);
			}
		}
		System.out.println(sum);
   }
}
		


	


