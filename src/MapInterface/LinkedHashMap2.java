package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		
		 LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		 Scanner sc=new Scanner(System.in);
		char x;
		
		do {
				System.out.println("Enter the key:");
				int key=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the value:");
				String value=sc.next();
				sc.nextLine();
				
				hm.put(key, value);
				System.out.println("Entry added: " + key + " : " + value);
							
			System.out.println("Do you want to add values");
			System.out.println("Enter Y for continue to N to discontinue");
			 x =sc.next().charAt(0);
			sc.nextLine();
		}while(Character.toUpperCase(x)=='Y');
		System.out.println("Final List:");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}

	}
}
