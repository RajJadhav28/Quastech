package Assignment;

import java.util.Scanner;

public class Armstrong {
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
		 if(temp==sum) {
			 System.out.println("Armstrong number");
		 }else {
			 System.out.println("Not an armstrong number.");
		 }
		 sc.close();
	}
}
