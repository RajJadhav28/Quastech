package String1;

import java.util.Scanner;

public class Pro10 {
	public static String[] wordcount(String s) {
		String words[]=s.trim().split("\\s+");
		return words;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.nextLine();
		String[] wordcount=wordcount(s1);
		System.out.println(wordcount.length);
		sc.close();
	}
}
