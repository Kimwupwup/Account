
public abstract class Account{
	
	private double balance;	//∞Ë¡¬
	
	Account(double balance) {
		this.balance = balance;
	}
	
	public void credit(double credit) {	//∞Ë¡¬ø° ¿‘±›
		balance = balance + credit;
	}
	
	protected void setBalance(double balance) {	//balance setter
		this.balance = balance;
	}
	
	public double getBalance() {	//balance getter
		return balance;
	}
	
	public void debit(double debit) throws Exception {	//∞Ë¡¬ √‚±›
		balance -= debit;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	
}
