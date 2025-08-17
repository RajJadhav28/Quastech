package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro20 {
	public static void main(String[] args) {
		List list=Arrays.asList(10,20,30,40,50);
		list.forEach(a->{
			System.out.println(a);
		});
//		System.out.println(list);
	}
}
