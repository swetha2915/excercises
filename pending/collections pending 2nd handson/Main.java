package collectionshandson;
import java.util.*;
class Student {

	private String name;
	private int matches;

	public Student(String name, int matches) {
		this.name = name;
		this.matches = matches;
	}
	public String toString() {
		return name + "-" + matches;
	}

	public String getName() {
		return name;
	}

	public int getmatches() {
		return matches;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,mat;
		String tname;
		n=sc.nextInt();sc.nextLine();
		Student[] students = new Student[n];
		
		for(int i=0;i<n;i++){
			tname=sc.nextLine();
			mat=sc.nextInt();sc.nextLine();
			students[i]=new Student(tname,mat);
		}

		Arrays.sort(students, new Comparator<Student>() {
			public int compare(Student first, Student second) {
				if (first.getmatches() != second.getmatches()) {
					return first.getmatches() - second.getmatches();
				}
				return first.getName().compareTo(second.getName());
			}
		});
		System.out.println("Team list after sort by number of matches");
		System.out.println(Arrays.toString(students));

	}

}
