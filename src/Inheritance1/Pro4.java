package Inheritance1;

interface Character{
	void attack();
}
interface Weapon{
	void use();
}
class Warrior implements Character, Weapon{
	public void attack() {
		System.out.println("Warrior attack with swords!!!");
	}
	public void use() {
		System.out.println("Warrior use sword!!!");
	}
}
public class Pro4 {
	public static void main(String[] args) {
		Warrior obj=new Warrior();
		obj.attack();
		obj.use();
	}
}
