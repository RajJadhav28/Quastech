package Multithreading1;

public class Pro8 extends Thread{
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				Thread.sleep(300);
				System.out.println("The current main thread name is"+Thread.currentThread().getName());
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Pro8 t1=new Pro8();
		Pro8 t2=new Pro8();
		Pro8 t3=new Pro8();
		
		t1.start();
		try {
			System.out.println("The current main thread name is"+Thread.currentThread().getName());
			t1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			System.out.println("The current main thread name is"+Thread.currentThread().getName());
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
