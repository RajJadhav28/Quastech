package String3;

import java.util.Scanner;

public class Pro1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.next();
		s=s.toLowerCase();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("Palandrome");
		}else {
			System.out.println("Not a palandrome");
		}
		String s1="Javatpoint";
		String arr[]=s1.split("t",0);
		for(String w:arr) {
			System.out.println(w);
		}
		sc.close();
	}
}
