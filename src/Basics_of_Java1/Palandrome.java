package Basics_of_Java1;

import java.util.Scanner;

public class Palandrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		int rem, sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a palandrome");
		}else {
			System.out.println(temp+" is not a palandrome");
		}
		sc.close();
	}

}
