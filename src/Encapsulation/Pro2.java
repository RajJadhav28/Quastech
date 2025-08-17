package Encapsulation;

class Account{
	private long acc_no;
	private String name, email;
	private float amount;
	
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
public class Pro2 {
	public static void main(String[] args) {
		Account obj=new Account();
		obj.setAcc_no(101);
		obj.setAmount(50000f);
		obj.setName("Quastech");
		obj.setEmail("q@gmail.com");
		System.out.println(obj.getName()+" "+obj.getEmail()+" "+obj.getAcc_no()+" "+obj.getAmount());
	}
}
