package ConstructorChaining;

public class Pro3 {
	Pro3(){
		this(5);
		System.out.println("Default constructor");
	}
	Pro3(int x){
		this(5,25);
		System.out.println(x);
	}
	Pro3(int x, int y){
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Pro3 obj=new Pro3();
	}
}
