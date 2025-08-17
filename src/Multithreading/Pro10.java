package Multithreading;

public class Pro10 extends Thread{
	public void run() {
		System.out.println("running...");
	}
	public static void main(String[] args) {
		Pro10 t1=new Pro10();
		Pro10 t2=new Pro10();
		System.out.println("Name of t1:"+t1.getName());
		System.out.println("Name of t2:"+t2.getName());
		t1.start();
		t2.start();
		t1.setName("Quastech");
		System.out.println("After changing the name:"+t1.getName());
	}
}
