package String4;

import java.util.Scanner;

public class Pro3 {
	public static String palandrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		s=s.toLowerCase();
		String result=palandrome(s);
		if(s.equals(result)) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a palandrome");
		}
	}
}
