package Patterns;

import java.util.Scanner;

public class Pro21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(char ch='A';ch<='E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
