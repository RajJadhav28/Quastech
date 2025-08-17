package Java8;

import java.util.Scanner;
import java.util.StringJoiner;

public class Pro18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringJoiner sj=new StringJoiner("$"+" ");
		System.out.println("Enter five colors:");
		for(int i=1;i<=5;i++) {
			sj.add(sc.next());
		}
		 // Manually add the delimiter after the last element
		System.out.println(sj+"$ ");
		var a=20;
		var b="Raj";
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}
}
