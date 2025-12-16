package String4;

import java.util.Scanner;

public class Pro2 {
	public static String[] wordCount(String s) {
		String words[]=s.trim().split("\\s+");
		return words;
	}
	public  String[] wordsCount1(String s1) {
		String words[]=s1.trim().split("\\s+");
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		String [] wordCount=wordCount(s);
		System.out.println("No.of words:"+wordCount.length);
		int count=charcount(s);
		System.out.println("Character count:"+count);
	}
}
