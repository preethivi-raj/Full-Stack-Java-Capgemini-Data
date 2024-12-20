package Arrays;

import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalMarks =0;
		
		System.out.println("Enter the no of marks");
		int n  = s.nextInt();
		
		int marks [] = new int[n];
		
		System.out.println("Enter the marks");
		for(int i=0 ; i<n; i++) {
			marks[i]=s.nextInt();
			totalMarks+=marks[i];
		}
		
		System.out.println("Total marks: " + totalMarks);
		System.out.println("Avg Marks : "+ ((float)totalMarks/(float)n) + "%");
		
		s.close();
	}

}
