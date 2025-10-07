package Abstraction__Interface;

abstract class cricket{
	cricket(){
		System.out.println("playing cricket...");
	}
	abstract void team();
	public void score() {
		System.out.println("Highest score");
	}
}
class IPL extends cricket{
	void team() {
		System.out.println("India\nUnited KingDom\nIran");
	}
}
public class Pro6 {
	public static void main(String[] args) {
		IPL obj=new IPL();
		obj.team();
		obj.score();
	}
}
