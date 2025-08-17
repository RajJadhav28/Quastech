package Inheritance;


interface M{
	int x=9;
	void a();
}
interface N{
	void b();
}
public class Pro3 implements M,N{
	public void a(){
		System.out.println("interface M method call");
	}
	public void b(){
		System.out.println("interface N method call");
	}
	void c() {
		System.out.println("Pro3 method call");
	}
	public static void main(String[] args) {
		
		Pro3 obj=new Pro3();
		obj.a();
		obj.b();
		obj.c();
	}

	

}

