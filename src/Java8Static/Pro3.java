package Java8Static;

import java.util.Scanner;
//non-static method
interface JavaInterface4{
	 int add(int a, int b);
}
public class Pro3 {
	public int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int b=sc.nextInt();
		Pro3 obj=new Pro3();
		JavaInterface4 obj1=obj::sum;
		int result=obj1.add(a, b);
		System.out.println("sum of numbers:"+result);
		sc.close();
	}
}
