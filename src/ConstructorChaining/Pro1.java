package ConstructorChaining;

public class Pro1 {
	Pro1(){
		this(5);
		System.out.println("Default constructor.");
	}
	Pro1(int x){
		this(5,15);
		System.out.println(x);
	}
	Pro1(int x, int y){
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Pro1 p=new Pro1();
	}
}
