package Multithreading;

class ThreadJoin1 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(300);
				
			}catch(Exception e) {
				System.out.println("The exception has been caught:"+e);
			}
			System.out.println(i);
		}
	}
}
public class Pro9 {
	public static void main(String[] args) {
		ThreadJoin1 t1=new ThreadJoin1();
		ThreadJoin1 t2=new ThreadJoin1();
		ThreadJoin1 t3=new ThreadJoin1();
		
		t1.start();
		try {
			
			t1.join(1500);
		}catch(Exception e) {
			System.out.println("The exception has been caught:"+e);
		}
		t2.start();
		
		t3.start();
	}
}
