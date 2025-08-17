package Java8_1;

interface JavaInterface{
	void showInterfaceInfo();
}
public class Pro3 {
	static void showInterfaceInfo() {
		System.out.println("This is called method reference");
	}
	public static void main(String[] args) {
		JavaInterface ji=Pro3::showInterfaceInfo;
		ji.showInterfaceInfo();
	}
}
