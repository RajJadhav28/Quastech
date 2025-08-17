package Basics_of_Java1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int sum, sum1=0, sum2=1;
		for(int i=1;i<=n;i++) {
			sum=sum1+sum2;
			sum1=sum2;
			sum2=sum;
			System.out.print(sum+" ");
		}
		sc.close();
	}
}
