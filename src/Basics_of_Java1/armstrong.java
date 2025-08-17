package Basics_of_Java1;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rem, sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Number "+temp+" is a palandrome");
		}else {
			System.out.println("Number "+temp+" is not a palandrome");
		}
		sc.close();
		}

}
