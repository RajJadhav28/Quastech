package Java8;

import java.util.Scanner;

interface A22{
	public void mult(int a, int b);
}
public class Pro22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		System.out.println("Enter the number of iterations:");
		int i=sc.nextInt();
		A22 obj=(a,b)->{
			for(int j=0;j<=i;j++) {
				System.out.println(n*j);
			}
		};
		obj.mult(n, i);
	}
}
