package Multithreading;

public class Pro13 extends Thread{
	public void run() {
		System.out.println("Inside the run method...");
	}
	public static void main(String[] args) {
		Thread.currentThread().setPriority(7);
		System.out.println("Priority of the main thread:"+Thread.currentThread().getPriority());
		Pro13 th1=new Pro13();
		System.out.println("Priority of the thread th1:"+th1.getPriority());
	}
}
