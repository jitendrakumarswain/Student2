package Student_Details_01;
//A person name suresh studies in12th class and he scores 
//following marks - physics-65, chemistry48,maths-45,optional -53
//(maximum mark for each subject is 75).
import java.util.Scanner;
public class P6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Student Name: "+"Suresh");
	int phy =65;
	int che = 48;
	int math = 45;
	int opt = 53;
	int total_secure_mark=65+48+45+53;
	System.out.println("Total secure mark: "+total_secure_mark);
	double totalmark=75*4;
	System.out.println("Total mark: "+totalmark);
	double percentage=total_secure_mark/totalmark*100;
	System.out.println("percentage is: "+percentage+'%');
	
	
}
}
