package Inheritance1;

class Employee{
	float salary=4000;
}
class Programer extends Employee{
	int bonus=10000;
}
public class Pro1 {
	public static void main(String[] args) {
		Programer p=new Programer();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}
}
