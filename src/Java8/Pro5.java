package Java8;

interface A13{
	public int add(int a, int b);
}
public class Pro5 {
	public static void main(String[] args) {
		A13 obj=(a,b)->{
			return a+b;
		};
		System.out.println(obj.add(10, 10));
	}
}
