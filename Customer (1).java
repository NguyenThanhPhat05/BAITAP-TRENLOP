package bai2;

public class Customer extends person {
	private int balance;
	
	public Customer(String name, String address, int balance){
		super(name,address);
		this.balance=balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public void display(){
		System.out.println("Ten: "+getName());
		System.out.println("Address: "+getAddress());
		System.out.println("Balance: "+getBalance());
	}

}
