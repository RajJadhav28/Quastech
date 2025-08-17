package FileHandling1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String path="D:\\File\\File5.txt";
		System.out.println("Enter the sentence:");
		String s=sc.nextLine();
		File file=new File(path);
		FileWriter writer;
		try {
			System.out.println("File Exist:"+file.exists());
			writer=new FileWriter(path, true);
			writer.write(s);
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
