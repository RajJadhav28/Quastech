package Multithreading1;

public class Pro1 extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Pro1 obj=new Pro1();
		obj.run();
	}
}
