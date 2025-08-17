package FileHandling1;

import java.io.PrintWriter;

import java.util.Scanner;

public class File5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		float f=sc.nextFloat();
		String path="D:\\File\\File6.txt";
		try (PrintWriter writer =new PrintWriter(path)){
			writer.print(f);
		}catch(Exception e) {
			System.err.println("Error: Could not create file at:"+path);
			e.printStackTrace();
		}
	}
}
