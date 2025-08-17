package Multithreading;

public class Pro2  implements Runnable{
	public void run() {
		System.out.println("thread is running...");
	}
	public static void main(String[] args) {
		Pro2 obj=new Pro2();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
