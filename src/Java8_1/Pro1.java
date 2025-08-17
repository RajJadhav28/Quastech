package Java8_1;

interface A11{
	public void add(int a, int b);
}
public class Pro1 {
	public static void main(String[] args) {
		A11 obj=(a,b)->{
			System.out.println(a+b);
		};
		obj.add(10, 20);
	}
}
