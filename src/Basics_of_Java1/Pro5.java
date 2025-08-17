package Basics_of_Java1;

import java.util.Scanner;

public class Pro5 {
	public static int armstrong(int num) {
		int sum=0,rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		
		int result=armstrong(num);
		if(result==num) {
			System.out.println("Number "+result+" an armstrong");
		}else {
			System.out.println("Not a armstrong number");
		}
		sc.close();
	}
}
