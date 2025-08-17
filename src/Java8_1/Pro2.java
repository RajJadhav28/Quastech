package Java8_1;

interface A13{
	public  int add(int a, int b);
}
public class Pro2 {
	public static void main(String[] args) {
		A13 obj=(a,b)->{
			return a+b;
		};
		System.out.println(obj.add(10, 20));
	}
}
