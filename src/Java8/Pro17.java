package Java8;

import java.util.Scanner;

interface A26{
	public double area(double r);
}
public class Pro17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r=sc.nextDouble();
		A26 obj=(r1)->{
			double area=3.14*r*r;
			return area;
		};
		System.out.println("Area of circle:"+obj.area(r));
		sc.close();
	}
}
