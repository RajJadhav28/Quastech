package FileHandling1;

import java.io.File;
import java.io.FileReader;

public class File4 {
	public static void main(String[] args) {
		String path="D:\\File\\File5.txt";
		File file=new File(path);
		FileReader reader;
		try {
			reader=new FileReader(path);
			int c=reader.read();
			while(c!=-1) {
				System.out.print((char)c);
				c=reader.read();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
