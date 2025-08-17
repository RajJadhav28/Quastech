package Basics_Of_Java;

public class Nestedfor1 {
	public static void main(String args[]) {
		for(int i=1;i<5;i++) {
			if(i%2==0) {
				for(int j=1;j<5;j++) {
					System.out.print("0");
				}
			}else {
				for(int j=1;j<5;j++) {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
			
	
