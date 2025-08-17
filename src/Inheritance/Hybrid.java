package Inheritance;

class c1{
	public void display1(){
		System.out.println("c");
	}
}
class b1 extends c1{
	public void display2(){
		System.out.println("b");
	}
}
class a1 extends c1{
	public void display3(){
		System.out.println("a");
	}
}
class d1 extends a1{
	public void display4() {
		System.out.println("d");
	}
}
public class Hybrid {
	public static void main(String[] args) {
		d1 obj=new d1();
		obj.display4();
		obj.display1();
		obj.display3();
	}
}
