package Today_17_8_2025;

public class Demo2 {
	// method
	public static void PrintNumber(int n) {
		System.out.println(n+ " ");
		if(n<10) {
			PrintNumber(++n);
		}
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		PrintNumber(1);
		System.out.println("Main method ended");

	}
}
