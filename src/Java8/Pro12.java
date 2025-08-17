package Java8;

interface JavaInterface2{
	int add(int a, int b);
}
public class Pro12 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		JavaInterface2 obj=Pro12::add;
		System.out.println(obj.add(10, 1));
	}
}
