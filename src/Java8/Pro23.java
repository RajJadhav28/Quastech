package Java8;

import java.util.Scanner;

interface A10{
	public void  show(int num);
}
public class Pro23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A10 obj=(num)->{for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}};
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		obj.show(num);
		sc.close();

	}

}
