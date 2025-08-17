package FileHandling1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class File6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentences:");
		String s=sc.nextLine();
		String path="D:\\File\\File5.txt";
		FileWriter writer=null;
		BufferedWriter bf=null;
		try {
			writer =new FileWriter(path, true);
			bf=new BufferedWriter(writer);
			bf.newLine();
			bf.write(s);
			bf.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
