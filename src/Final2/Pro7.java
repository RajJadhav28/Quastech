package Final2;
//Q) What is the final parameter?
//Ans) If you declare any parameter as final, we cannot change its value of.
public class Pro7 {
	public static void value(final int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		new Pro7().value(10);
	}
}
