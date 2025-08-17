package Super1;

class Animal{
	String color="White";
}
class Dog extends Animal{
	String color="Black";

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

