package P1;

public class Swap {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("Before swapping variable values are...."+a+"  "+b);
	
//Logic - 1 - Third Variable
//	int t=a;
//	a=b;
//	b=t;
//	
//	System.out.println("After swapping variable values are...."+a+"  "+b);
	
	//Logic - 2 - Use + & - without using third variable 
	
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	
	//System.out.println("After swapping variable values are...."+a+"  "+b);
	
	// Logic - 3 - Using * and / but value should not be Zero
	/*a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("After swapping variable values are...."+a+"  "+b);*/
	
//	Logic - 4 (Single line statement)
	
	b= a+b-(a=b);
	
	System.out.println("After swapping variable values are...."+a+"  "+b);
}
}
