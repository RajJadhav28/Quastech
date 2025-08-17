package FileHandling1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Pro12 {
	public static void main(String[] args) {
		String path="D:\\File\\File7.txt";
		String path1="D:\\File\\File8.txt";
		String path2="D:\\File\\File9.txt";
		
		FileReader reader=null;
		BufferedReader bf=null;
		FileReader reader2=null;
		BufferedReader bf2=null;
		FileWriter writer=null;
		try {
			reader=new FileReader(path);
			bf=new BufferedReader(reader);
			reader2=new FileReader(path1);
			bf2=new BufferedReader(reader2);
			writer=new FileWriter(path2);
			
			String name=bf.readLine();
			String number=bf2.readLine();
			
			while(name!=null && number!=null) {
				writer.write(name+":"+number+"\n");
				name=bf.readLine();
//				number=bf2.readLine();
			}
			writer.flush();
			System.out.println("Data written to file successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
