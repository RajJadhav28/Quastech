package Java8;

interface JavaInterface21{
	void showInfo();
}
public class Pro13 {
	Pro13(){
		System.out.println("Constructors using method references.");
	}
	public static void main(String[] args) {
		JavaInterface21 obj=Pro13::new;
		obj.showInfo();
	}
}
