package Final;


//Q) What is the final parameter?
//Ans) If you declare any parameter as final, we cannot change its value of.
public class Pro7 {
	public void value(final int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Pro7 obj=new Pro7();
		obj.value(1000);
	}
}
