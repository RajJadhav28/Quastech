package Multithreading1;

public class Pro4 implements Runnable{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		Pro4 obj=new Pro4();
		Thread t2=new Thread(obj);
		t2.start();
		String str=t2.getName();
		System.out.println(str);
	}
}
