package Inheritance1;

class Address{
	String city, state, country;
	
	Address(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
		}
	
	int id;
	String name;
	Address address;
}
class Emp{
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}
public class Pro5 {
	public static void main(String[] args) {
		Address obj=new Address("Mumbai", "Maharashtra", "India");
		Emp e=new Emp(1, "Raj", obj);
		e.display();
	}
}
