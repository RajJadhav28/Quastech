package Multithreading1;

public class Pro11 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		Pro11 runnable=new Pro11();
		ThreadGroup tg1=new ThreadGroup("Parent thread Group");
		
		Thread t1=new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2=new Thread(tg1, runnable, "one");
		t2.start();
		Thread t3=new Thread(tg1, runnable, "one");
		t3.start();
		
		System.out.println("Thread Group Name:"+tg1.getName());
		tg1.list();
	}
}
