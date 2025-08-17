package Inheritance;

class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking...");
	}
}
class Babydog extends Dog{
	void weep() {
		System.out.println("weeping...");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Babydog obj=new Babydog();
		obj.eat();
		obj.bark();
		obj.weep();
	}
}
