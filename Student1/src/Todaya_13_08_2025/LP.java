package Todaya_13_08_2025;
import java.util.Scanner;
public class LP {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int num=sc.nextInt();
	int rev=0;

	//logic
	while(num!=0) {
		rev=num*10+(num%10);
		num=num/10;
	}
	System.out.println(rev);
}
}
