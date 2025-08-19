package Student_Details_01;

import java.util.Scanner;

public class P1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String Name;
	int Rollno;
	char Grade;
	System.out.println("Ener student name:  ");
	Name=sc.next();
	System.out.println("Enter rollno: ");
	Rollno=sc.nextInt();
	System.out.println("Enter Grade: ");
	Grade =sc.next().charAt(0);
	
// Print the student Details
	System.out.println(" Name is : "+ Name);
	System.out.println("Rollno is: "+ Rollno);
	System.out.println("Grade is: "+Grade);
	
	// We can store numerical value in char because some grading system
}
}
