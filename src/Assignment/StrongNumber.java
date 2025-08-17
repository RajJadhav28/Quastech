package Assignment;

import java.util.Scanner;

public class StrongNumber {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}
		return f;
	}
	public static boolean isStrong(int num) {
		int sum=0, rem ;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		return temp==sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		if(isStrong(num)) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a strong number.");
		}
		sc.close();
	}
}
