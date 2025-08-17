package This_keyword;


//this: To Invoke Current Class Method
class A{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		this.m();
	}
}
public class Pro2 {
	public static void main(String[] args) {
		A obj=new A();
		obj.n();
	}
}
