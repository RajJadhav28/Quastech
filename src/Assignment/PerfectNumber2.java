package Assignment;

import java.util.Scanner;

public class PerfectNumber2 {
	public static boolean isPerfect(int num) {
		if(num<=1) {
			return false;
		}
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
//				System.out.println("Divisiors:"+i);
				
			}
		}
//		System.out.println(sum);
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(isPerfect(i)) {
				System.out.println("Perfect number:"+i);
			}
		}
		sc.close();
	}
}
