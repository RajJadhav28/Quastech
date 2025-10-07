package Multithreading1;

public class Pro9 extends Thread{
	public void run() {
		System.out.println("inside the run method...");
	}
	public static void main(String[] args) {
		Pro9 th1=new Pro9();
		Pro9 th2=new Pro9();
		Pro9 th3=new Pro9();
		
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		
		th1.setPriority(10);
		th2.setPriority(1);
		th3.setPriority(6);
		
		System.out.println(th1.getPriority());
		System.out.println(th2.getPriority());
		System.out.println(th3.getPriority());
		
		System.out.println("Currently executing the Thread:"+Thread.currentThread().getName());
		System.out.println("Priority of the main thread:"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the main thread after changing:"+Thread.currentThread().getPriority());

	}
}
