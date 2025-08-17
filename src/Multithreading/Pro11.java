package Multithreading;

public class Pro11 extends Thread{
	Pro11(String threadName){
		super(threadName);
	}
	public void run() {
		System.out.println("The thread is executing...");
	}
	public static void main(String[] args) {
		Pro11 th1=new Pro11("JavatPoint");
		Pro11 th2=new Pro11("Quastech");
		
		System.out.println("Thread-1:"+th1.getName());
		System.out.println("Thread-2:"+th2.getName());
	}
}
