package pkg;

public class Account {
	
	private double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void enter(double i) {
		this.setBalance(this.getBalance()+i);
		
		
	}

	public void remove(double i) {
		this.setBalance(this.getBalance()-i);
		
	}
	
	
}
