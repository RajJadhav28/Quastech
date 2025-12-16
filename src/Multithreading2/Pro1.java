package Multithreading2;

class Multi extends Thread{
	public void run() {
		System.out.println("thread is running....");
	}
}
public class Pro1 {
	public static void main(String[] args) {
		Multi obj=new Multi();
		obj.run();
	}
}
