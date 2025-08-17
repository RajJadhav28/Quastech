package Assignment;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n=sc.nextInt();
		System.out.println("Enter the second number:");
		int m=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(n%j==0 && m%j==0) {
					k=j;
				}
			}
		}
		System.out.println("Highest common factor:"+k);
	}
}
