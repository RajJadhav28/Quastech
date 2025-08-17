package Java8;

 class A{
	 public void add(int a, int b) {
		 int result=a+b;
		 System.out.println(result);
	 }
 } 
public class Pro2 {
	public static void main(String[] args) {
		A obj=new A();
		obj.add(10, 20);
	}
}
