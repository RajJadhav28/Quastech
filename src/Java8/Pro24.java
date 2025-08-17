package Java8;

import java.util.Scanner;

interface A24{
	public void eo(int n);
}
public class Pro24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		A24 obj=(n)->{
			if(n%2==0) {
				System.out.println("even number");
			}else {
				System.out.println("Odd number");
			}
		};
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		obj.eo(n);
	}
}
