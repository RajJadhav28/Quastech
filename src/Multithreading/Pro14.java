package Multithreading;

public class Pro14 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Deamon thread works");
		}else {
			System.out.println("User Thread works");
		}
	}
	public static void main(String[] args) {
		Pro14 t1=new Pro14();
		Pro14 t2=new Pro14();
		Pro14 t3=new Pro14();
		//always first set the daemon thread and then start it otherwise it will through IllegalThreadStateException.
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
