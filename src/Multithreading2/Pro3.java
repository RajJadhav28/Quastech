package Multithreading2;

public class Pro3 extends Thread{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Pro3 obj=new Pro3();
		obj.start();
	}
}
