package Multithreading;

public class Pro12 extends Thread{
	public void run() {
		System.out.println("Inside the run method.");
	}
	public static void main(String[] args) {
		Pro12 th1=new Pro12();
		Pro12 th2=new Pro12();
		Pro12 th3=new Pro12();
		
		System.out.println("Priority of thread th1:"+th1.getPriority());
		System.out.println("Priority of thread th2:"+th2.getPriority());
		System.out.println("Priority of thread th3:"+th3.getPriority());
		
		System.out.println("Currently executing the Thread:"+Thread.currentThread().getName());
		System.out.println("Priority of the main thread:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the main thread after changing:"+Thread.currentThread().getPriority());
	}
}
