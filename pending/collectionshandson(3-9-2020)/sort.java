package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> li=new ArrayList<Integer>(n);
		for( int i=0;i<n;i++)
		{
			li.add(sc.nextInt());
		}
		Collections.sort(li);
		System.out.println(li);
		
	}

}
