package Assignment;

import java.util.Scanner;

public class Palandrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0, rem;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palandrome.");
		}else {
			System.out.println("Not a palandrome.");
		}
		sc.close();
	}
}
