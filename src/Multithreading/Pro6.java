package Multithreading;

public class Pro6 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Pro6 obj=new Pro6();
//		Pro6 obj1=new Pro6();
		obj.start();
//		obj1.start();
	}
}
