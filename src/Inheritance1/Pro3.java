package Inheritance1;

interface M{
	int x=9;
	void a();
}
interface N{
	void b();
}
public class Pro3 implements M,N{
	public void a() {
		System.out.println("interface M method is called");
	}
	public void b() {
		System.out.println("interface N method is called");
	}
	void c() {
		System.out.println("Pro3 method called");
	}
	public static void main(String[] args) {
		Pro3 obj=new Pro3();
		obj.a();
		obj.b();
		obj.c();
	}
}
