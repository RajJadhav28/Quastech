package Basics_of_Java1;

import java.util.Scanner;

public class Pro1 {
	public static int area(int r) {
		int area=(int) (3.14*r*r);
		return area;
	}
	public  int tarea(int h, int b) {
		int area=(b*h)/2;
		return area;
	}
	public static void rectarea(int l,int b) {
		int area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	 void square(int s) {
		int area=s*s;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Pro1 p=new Pro1();
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter the radius of circle:");
//		int r=sc.nextInt();
//		int result=area(r);
//		System.out.println("Area of cirle:"+result);
	
//		System.out.println("Enter the height:");
//		int h=sc.nextInt();
//		System.out.println("Enter the base:");
//		int b=sc.nextInt();
//		System.out.println(p.tarea(h,b));
	
//		System.out.println("Enter the length:");
//		int l=sc.nextInt();
//		System.out.println("Enter the breadth:");
//		int b=sc.nextInt();
//		rectarea(l,b);
		
		System.out.println("Enter the side:");
		int s=sc.nextInt();
		p.square(s);
		
	}
}
