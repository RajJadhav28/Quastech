package AccessModifiers;
import AccessModifiers2.Pro11;
//The protected access modifier is accessible within the package and outside the package,
//but through inheritance only.

//The protected access modifier can be applied to the data member, 
//method and constructor. It cannot be applied to the class.
//It provides more accessibility than the default modifier.


public class Pro6 extends Pro11{
	public static void main(String[] args) {
		Pro6 obj=new  Pro6();
		obj.msg();
	}
}
