
public abstract class Account implements Valuable{
	
	private double balance;	//°èÁÂ
	
	Account(double balance) {
		this.balance = balance;
	}
	
	public void credit(double credit) {	//°èÁÂ¿¡ ÀÔ±İ
		balance = balance + credit;
	}
	
	protected void setBalance(double balance) {	//balance setter
		this.balance = balance;
	}
	
	public double getBalance() {	//balance getter
		return balance;
	}
	
	public void debit(double debit) {	//°èÁÂ Ãâ±İ
		
		if(balance - debit > 0) {	//°èÁÂ1¿¡ ÀÜ°íÈ®ÀÎ ÈÄ ÀÛ¾÷
			balance = balance - debit;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	
}
