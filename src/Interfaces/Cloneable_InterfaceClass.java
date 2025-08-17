package Interfaces;


class Address implements Cloneable{
	 private String city;
	    private String state;
		public Address(String city, String state) {
			super();
			this.city = city;
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
}
	    class Student implements Cloneable{
	    	 private String name;
	    	    private int age;
	    	    private Address address; // Reference type
				public Student(String name, int age, Address address) {
					super();
					this.name = name;
					this.age = age;
					this.address = address;
				}
				@Override
				protected Object clone() throws CloneNotSupportedException {
					Student cloned =(Student)super.clone();
					cloned.address=(Address)address.clone();
					return cloned;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				 public Address getAddress() {
					return address;
				}
				public void setAddress(Address address) {
					this.address = address;
				}
				@Override
				    public String toString() {
				        return "Student [name=" + name + ", age=" + age + 
				               ", address=" + address.getCity() + ", " + address.getState() + "]";
				    }
	    }

public class Cloneable_InterfaceClass {
	public static void main(String[] args) {
		try {
			Address addr = new Address("New York", "NY");
            Student original = new Student("Alice", 20, addr);
            
            //clone the object
            Student cloned=(Student) original.clone();
            
            //change the original object
            
            original.setName("Bob");
            original.getAddress().setCity("Boston");
            
            System.out.println("Original:"+original);
            System.out.println("Cloned:"+cloned);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
