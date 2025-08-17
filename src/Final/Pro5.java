package Final;


//Q) Can we initialize a blank final variable?
//Ans) Yes, but only in the constructor. For example:
public class Pro5 {
	final int speedlimit;
	Pro5(){
		speedlimit=80;
		System.out.println(speedlimit);
	}
	public static void main(String[] args) {
		new Pro5();
	}
}
