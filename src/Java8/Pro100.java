package Java8;

interface JavaInterface4{
	void showInterfaceInfo();
}
public class Pro100 {
	void show() {
		System.out.println("This is called using instance method reference");
	}
	public static void main(String[] args) {
		Pro100 obj=new Pro100();
		JavaInterface4 mi=obj::show;
		mi.showInterfaceInfo();
	}
}
