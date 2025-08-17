package Java8_1;

interface JavaInterface1{
	void showInterface(int a, int b);
}
public class Pro4 {
	static void showInterfaceInfo(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		JavaInterface1 ji=Pro4::showInterfaceInfo;
		ji.showInterface(10, 20);
	}
}
