package Java8;

interface JavaInterface{
	void showInterfaceInfo();
}
public class Pro10 {
	static void showInterfaceInfo() {
		System.out.println("This is called method reference");
	}
	public static void main(String[] args) {
		JavaInterface ji=Pro10::showInterfaceInfo;
		ji.showInterfaceInfo();
	}
}
