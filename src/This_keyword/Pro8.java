package This_keyword;

class A31{
	A31 getA31() {
		return this;
	}
	void msg() {
		System.out.println("hello java");
	}
}
public class Pro8 {
	public static void main(String[] args) {
		
		new A31().getA31().msg();
	}
}
