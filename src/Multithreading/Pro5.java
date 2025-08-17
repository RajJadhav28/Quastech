package Multithreading;

public class Pro5 {
	public static void main(String[] args) {
		System.out.println("Start");
	
	try {
		Thread.sleep(2000);
	}catch(Exception e) {
		System.out.println("Thread Interrupted.");
	}
	System.out.println("End");
	}
}
