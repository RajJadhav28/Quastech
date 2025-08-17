package FileHandling1;

import java.io.File;
import java.io.FileWriter;

public class File1 {
	public static void main(String[] args) {
		String path="D:\\File\\File6.txt";
		File file=new File(path);
		FileWriter writer;
//		try {
//			if(file.createNewFile()) {
//				System.out.println("File created successfully");
//				
//			}else {
//				System.out.println("File already exist");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(file.exists());
//		System.out.println(file.canRead());
//		System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		try {
//			file.mkdir();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		String list[]=file.list();
//		for(String s:list) {
//			System.out.println(s);
//		}
//		System.out.println(file.delete());
		try {
			writer =new FileWriter(path);
			writer.write("Hello Student");
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
