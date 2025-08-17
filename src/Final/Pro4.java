package Final;

//Can we inherit final method?
//Ans) Yes, the final method can be inherited, but we cannot override it. For Example:
class Bike{
	final void run() {
		System.out.println("running...");
	}
}
public class Pro4 extends Bike{
	public static void main(String[] args) {
//		new Pro4().run();//method 1
		Pro4 obj=new Pro4();//method 2
		obj.run();
	}
}
