// Write a java program to print the area of circle?
package Student_Details_01;
import java.util.Scanner;
public class P4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double pi=3.141;
	System.out.println("Enter radius of the circle:  ");
	double rad=sc.nextDouble();
	//Area of circle
	double area=pi*rad*rad;
	System.out.println("Area of circle: "+area);
	

}
}
