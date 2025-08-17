package Java8;

class A1{
	public int add(int a, int b) {
		return a+b;
	}
}
public class Pro1 {
	public static void main(String[] args) {
		A1 obj=new A1();
//		int result=obj.add(10, 20);second method
		System.out.println(obj.add(20, 40));//first method
//		System.out.println(result);//second method
		
	}
}
