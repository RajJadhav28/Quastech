package Abstraction__Interface;

abstract class M{
	abstract void a();
	abstract void b();
	abstract void c();
	public void d() {
		System.out.println("D");
	}
}
class N extends M{
	public void a() {
		System.out.println("A");
	}
	public void b() {
		System.out.println("B");
	}
	public void c() {
		System.out.println("C");
	}
}
public class Pro4{
	public static void main(String[] args) {
		N obj=new N();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		}
}

