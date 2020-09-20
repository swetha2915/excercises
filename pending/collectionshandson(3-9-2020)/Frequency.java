package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int n=sc.nextInt();
		List<String> li=new ArrayList<String>(n);
		for(int i=0;i<n;i++)
		{
			li.add(sc.nextLine());
		}
		Set<String> s=new HashSet<String>(li);
		int sum=0;
		for(String st:s)
		{
		System.out.println(st+":"+Collections.frequency(li,st));
		sum++;
		}
        System.out.println(sum);
	}

}
