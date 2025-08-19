package Today_date;
//Student details using constructor
class Sampl1 {
	// Variable Declaration
	String Name;
	int Age;
	char Gender;

	// constructor
	Sampl1(String arg1,int arg2, char arg3){
	Name = arg1;
	Age =arg2;
	Gender = arg3;
	}
	
	//Method to display
	void display() {
		System.out.println("Name: "+Name+" Age: "+Age +" Gender: " +Gender);
	}
	public static void main(String[] args) {
		Sampl1 s1=new Sampl1("Jitendra",20,'M');
		s1.display();
		
	}
	
}
