package Multithreading;

public class Pro7 {
	public static void main(String[] args) {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(500);
				System.out.println(i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
