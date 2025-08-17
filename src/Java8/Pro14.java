package Java8;

interface javaInterface11{
	void add(int a, int b);
}
public class Pro14 {
	int a,b;
	Pro14(int a, int b){
		this.a=a;
		this.b=b;
		display();
	}
	void display() {
		int sum=a+b;
		System.out.println("Sum of variables:"+sum);
	}
	public static void main(String[] args) {
		javaInterface11 obj= Pro14::new;
		obj.add(10, 2);
	}
}
