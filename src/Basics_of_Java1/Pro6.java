package Basics_of_Java1;

import java.util.Scanner;

public class Pro6 {
	public static int palandrome(int num) {
		int rem, sum=0;
		while(num>0) {
		rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		int result=palandrome(num);
		if(result==num) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a palandrome");
		}
		sc.close();
		}
}
