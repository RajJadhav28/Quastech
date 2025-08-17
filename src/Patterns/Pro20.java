package Patterns;

import java.util.Scanner;

public class Pro20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int num=2*i-1;
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
