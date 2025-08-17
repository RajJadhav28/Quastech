package Java8;

import java.util.Scanner;

interface A4{
	public int add(int a, int b);
}
public class Pro6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		A4 obj=(i,j)->{
			return a+b;
		};
		System.out.println(obj.add(a, b));
	}
}
