package Java8;

interface JavaInterface1{
	void showInterfaceInfo(int a, int b);
}
public class Pro11 {
	static void showInterfaceInfo(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		JavaInterface1 obj=Pro11::showInterfaceInfo;
		obj.showInterfaceInfo(10, 20);
	}
}
