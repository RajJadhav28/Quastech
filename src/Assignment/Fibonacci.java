package Assignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum1=0, sum2=1, sum3;
		for(int i=0;i<=n;i++) {
			sum3=sum1+sum2;
			sum1=sum2;
			sum2=sum3;
			System.out.println(sum3);
		}
		sc.close();
	}
}
