package String3;

import java.util.Scanner;

public class Pro7 {
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
		System.out.println("Reverse:"+result);
		if(s.equals(result)) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a Palandrome");
		}
		int s2=s.length();
		System.out.println(s2);
		sc.close();
	}
}
