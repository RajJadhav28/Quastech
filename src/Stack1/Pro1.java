package Stack1;

import java.util.Scanner;
import java.util.Stack;

public class Pro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> al=new Stack<Integer>();
		System.out.println("Enter the size of array:");
		int count=sc.nextInt();
		for(int i=0;i<count;i++) {
			al.push(sc.nextInt());
		}
		System.out.println(al);
	}
}
