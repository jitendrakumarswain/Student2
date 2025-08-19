package Todaya_13_08_2025;

class Employee {
int sal=12000;
}
class Programmer extends Employee
{
	int bonus=13000;
}
class ttt
{
public static void main(String[] args) {
	Programmer p1=new Programmer();
	System.out.println(p1.sal);
	System.out.println(p1.bonus);
	
}
}
