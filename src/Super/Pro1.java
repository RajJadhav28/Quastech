package Super;
//super can be used to refer to the immediate parent class instance variable.
class Animal{
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
} 
public class Pro1 {
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.printColor();
	}
}
