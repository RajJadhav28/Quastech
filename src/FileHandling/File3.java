package FileHandling;

import java.io.FileReader;

public class File3 {
	public static void main(String[] args) {
		String path="D:\\File\\File3.txt";
		FileReader reader;
		try {
			reader=new FileReader(path);
			System.out.println((char)reader.read());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
