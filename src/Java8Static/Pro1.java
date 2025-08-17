package Java8Static;


interface A1{
	public void add(int a, int b);
}
public class Pro1 {
	public static void sumOfNumber(int a, int b) {
		int c=a+b;
		System.out.println("Sum of numbers:"+c);
	}
	public static void main(String[] args) {
		A1 obj=Pro1::sumOfNumber;
		obj.add(10, 20);
	}
}
