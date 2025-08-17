package Basics_of_Java1;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n=sc.nextInt();
//		
//		while(n!=5) {
//			System.out.println(n);
//			n++;
//		}
		System.out.println("Enter the value:");
		int i=sc.nextInt();
		do {
			System.out.println(i);
			i++;
			
		}while(i!=5);
		sc.close();
	}

}
