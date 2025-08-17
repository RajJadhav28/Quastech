package Java9;

import java.util.List;

public class Pro2 {
	public static void main(String[] args) {
		List<String>list=List.of("Java","Python","C","C++",".Net");
		list.forEach(a->{
			System.out.println(a);
		});
	}
}
