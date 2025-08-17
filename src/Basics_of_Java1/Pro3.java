package Basics_of_Java1;

import java.util.Scanner;

public class Pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=sc.nextInt();
		switch(i) {
		case 1:add();
		break;
		case 2:subtract();
		break;
		case 3:multiply();
		break;
		case 4:divide();
		break;
		}
	}
	
	

	public static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public static void subtract() {
		int a=10;
		int b=20;
		System.out.println(a-b);
	}
	private static void multiply() {
		int a=10;
		int b=20;
		System.out.println(a*b);
	}
	private static void divide() {
		int a=10;
		int b=20;
		System.out.println(a/b);
		
	}
	
}
