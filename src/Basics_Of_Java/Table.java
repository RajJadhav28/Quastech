package Basics_Of_Java;
import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0,sum1=0;
		System.out.println("Enter the value:");
		n=sc.nextInt();
		for(i=1;i<=10;i++) {
			sum=n*i;
			System.out.println(sum);
		}
		for(i=1;i<=n;i++) {
			sum1=sum1+i;
		}
		System.out.println("Value of addition of 1 to "+n);
		System.out.println(sum1);
	}
}
