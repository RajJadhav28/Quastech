package Abstraction__Interface;

interface M1{
	public void a();
	public void b();
	public void c();
	public void d();
}
abstract class N1 implements M1{
	public void d() {
		System.out.println("D");
	}
}
class P extends N1{

	@Override
	public void a() {
		System.out.println("A");
		
	}

	@Override
	public void b() {
		System.out.println("B");
		
	}

	@Override
	public void c() {
		System.out.println("C");
	}
}
public class Pro5 {
	public static void main(String[] args) {
		M1 obj=new P();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}
