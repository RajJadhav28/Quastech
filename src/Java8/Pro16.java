package Java8;

import java.util.Scanner;

interface A25{
	public int area(int l, int b);
}
public class Pro16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int l=sc.nextInt();
		System.out.println("Enter the breadth");
		int b=sc.nextInt();
		A25 obj=(m,n)->{
			int area=l*b;
			return area;
		};
		System.out.println(obj.area(l, b));
		sc.close();
	}
}
