package Static;

class Calculate{
	public static int cube(int x) {
		return x*x*x;
	}
}
public class Pro4 {
	static {
		System.out.println("static block is invoked.");
	}
	public static void main(String[] args) {
		System.out.println("Hello main");
		int result=Calculate.cube(5);
		System.out.println(result);
	}
}
