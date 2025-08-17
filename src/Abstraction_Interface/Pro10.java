package Abstraction_Interface;

interface Showable3{
	void show();
	interface Message{
		void msg();
	}
}
public class Pro10 implements Showable3.Message{
	public void msg() {
		System.out.println("Hello Nested Interface");
	}
	public void show(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Showable3.Message message=new Pro10();
		message.msg();
		Pro10 obj=new Pro10();
		obj.show();
		obj.msg();	
	}
}
