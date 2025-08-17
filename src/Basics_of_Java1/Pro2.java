package Basics_of_Java1;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		switch(num) {
		case 1:System.out.println("10");
		break;
		case 2:System.out.println("20");
		break;
		case 3:System.out.println("30");
		break;
		default:System.out.println("Not in 1,2,3");
		sc.close();
		}
	}
}
