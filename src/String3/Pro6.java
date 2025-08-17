package String3;

import java.util.Scanner;

public class Pro6 {
	
	public static String[] wordcount(String s) {
		String words[]=s.trim().split("\\s+");
		return words;
	}
	
	public static int charcount(String s1) {
		int c=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				c++;
			}
		}
		return c;
	}
	
	public static int spacecount(String s2) {
		int c=0;
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)==' ') {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		String wordcount1[]=wordcount(s1);
		System.out.println("No.of words:"+wordcount1.length);
		
		int charcount1=charcount(s1);
		System.out.println("No.of characters:"+charcount1);
		int spacecount=spacecount(s1);
		System.out.println("Space count:"+spacecount);
		sc.close();
	}
}
