package FileHandling1;

import java.io.BufferedReader;
import java.io.FileReader;

public class File10 {
	public static void main(String[] args) {
		String path="D:\\File\\File5.txt";
		FileReader reader=null;
		BufferedReader bf=null;
		try {
			reader=new FileReader(path);
			bf=new BufferedReader(reader);
			String line=bf.readLine();
			int c=0;
			int sum=0;
			while(line!=null) {
				c++;
				int l=line.length();
				sum=sum+l;
				line=bf.readLine();
				System.out.println((String)line);
			}
			System.out.println("No. of lines:"+c);
			System.out.println("No. of char values:"+sum);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
