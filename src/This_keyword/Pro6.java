package This_keyword;
//this: To Pass as an Argument in The Method
public class Pro6 {
	void m(Pro6 obj) {
		System.out.println("method is invoked.");
	}
	void p() {
		m(this);
	}
	public static void main(String[] args) {
		Pro6 m=new Pro6();
		m.p();
	}
}
