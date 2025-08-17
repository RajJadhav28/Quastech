package Java8_1;

interface JavaInterface21{
	void showInfo();
}
public class Pro5 {
	Pro5(){
		System.out.println("Constructor using method reference");
	}
	public static void main(String[] args) {
		JavaInterface21 obj=Pro5::new;
		obj.showInfo();
	}
}
