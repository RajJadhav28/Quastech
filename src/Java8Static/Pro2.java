package Java8Static;

import java.util.Scanner;

interface A2{
	public void add(int a, int b);
}
public class Pro2 {
	public static void sum(int a, int b) {
		int c=a+b;
		System.out.println("Addition of values:"+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int b=sc.nextInt();
		A2 obj=Pro2::sum;
		obj.add(a, b);
		sc.close();
	}
}
