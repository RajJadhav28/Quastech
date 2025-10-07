package Expenzing;

public class Pro2 {
	Pro2(){
		this(5);
		System.out.println("Default constructor");
	}
	Pro2(int x){
		this(5,25);
		System.out.println(x);
	}
	Pro2(int x, int y){
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Pro2 obj=new Pro2();
	}
}
