package FileHandling1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class File11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path="D:\\File\\File5.txt";
		System.out.println("Enter the sentences:");
		String s=sc.nextLine();
//		FileWriter writer=null;
//		BufferedWriter bf=null;
		PrintWriter writer=null;
		try {
//			writer=new FileWriter(path);
//			bf=new BufferedWriter(writer);
//			bf.write(s);
//			bf.flush();
			
			writer=new PrintWriter(path);
			writer.print(s);
			writer.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
