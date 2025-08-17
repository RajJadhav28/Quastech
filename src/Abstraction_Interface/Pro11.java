package Abstraction_Interface;

interface Showable4{
	void show();
	interface Message{
		void msg();
	}
}
public class Pro11 implements Showable4, Showable4.Message{
	public void msg() {
		System.out.println("Hello Nested Interface");
	}
	public void show(){
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Showable4.Message message=new Pro11();
		message.msg();
		Pro10 obj=new Pro10();
		obj.show();
		obj.msg();
		Showable4 obj1=new Pro11();
		obj1.show();
	}

}
