package Multithreading1;

public class Pro7 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Pro7 t1=new Pro7();
		t1.start();
	}
}
