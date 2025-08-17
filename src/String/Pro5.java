package String;

import java.util.Scanner;

public class Pro5 {
	public static String rev(String s) {
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
		String result=rev(s);
		if(s.equals(result)) {
			System.out.println(s+" is a palandrome.");
		}else {
			System.out.println(s+" is not a palandrome.");
		}
		sc.close();
	}
}
