package Final2;

//Q) Can we initialize a blank final variable?
//Ans) Yes, but only in the constructor. For example:
public class Pro5 {
	
		final int speedLimit;
		Pro5(){
			speedLimit=70;
			System.out.println(speedLimit);
		}
	public static void main(String[] args) {
		new Pro5();
	}
}
