package Abstraction_Interface;

abstract class Animal{
	abstract void makeSound();

void eat() {
	System.out.println("I can eat");
}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Barking...");
	}
}
public class Pro1 {
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.makeSound();
		obj.eat();
	}
}
