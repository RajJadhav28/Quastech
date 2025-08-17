package FileHandling1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File7 {
	public static void main(String[] args) {
		String path="D:\\File\\File7.txt";
		File file=new File(path);
		
		try {
			FileReader reader=new FileReader(path);
			BufferedReader bf=new BufferedReader(reader);
			String line=bf.readLine();
			int count=0;
			int sum=0;
			while(line!=null) {
				count++;
//				int l=line.length();
//				sum=sum+l;
				line=bf.readLine();
			}
			System.out.println("Line:"+count);
			System.out.println("No of char values:"+sum);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
