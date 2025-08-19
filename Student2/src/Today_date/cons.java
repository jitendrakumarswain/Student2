package Today_date;

public class cons {
int x;
int y;

cons()
{
	System.out.println("Running constructor body");
	int x=100;
	int y=200;
}
}
class pass1{
	public static void main(String[] args) {
		cons c1=new cons();
		System.out.println(c1.x);
	}
}


