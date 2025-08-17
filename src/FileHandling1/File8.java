package FileHandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class File8 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String:");
		 String s=sc.nextLine();
		 String path="D:\\File\\File7.txt";
		 FileWriter write=null;
		 FileReader reader=null;
		 BufferedReader bf=null;
		 try {
			 reader =new FileReader(path);
			 bf=new BufferedReader(reader);
			 String line=bf.readLine();
			 write=new FileWriter(path);
			 int count=0;
			 int sum=0;
			 while(line!=null) {
				 count++;
				 int l=line.length();
				 sum=sum+l;
				 line =bf.readLine();
			 }
			 bf.read();
			 write.flush();
			 System.out.println("No.of characters:"+sum);
			 System.out.println("No.of lines:"+count);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
