package Basics_of_Java1;

import java.util.Scanner;

public class Pro7 {
	public static void fibonacci(int n) {
		int num1=0, num2=1,num = 0;
		for(int i=1;i<=n;i++) {
		num=num1+num2;
		num1=num2;
		num2=num;
		System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
			fibonacci(n);
			sc.close();
		}
}
