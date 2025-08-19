// Write a program to calculate area of tringle?
package Student_Details_01;
import java.util.Scanner;
public class P5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter base value of tringle: ");
	float base=sc.nextFloat();
	System.out.println("Enter height value of tringle: ");
	double height=sc.nextDouble();
	// Area of Tringle
	double tringle=1/2*base*height;
	System.out.println("Tringle area is: "+tringle);
	// in integer division 1/2 =0, for variable type another 0 is showing
}
}
