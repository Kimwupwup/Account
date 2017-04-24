/**
 * throws / throw를 통한  예외처리 추가
 */

public abstract class Account{
	
	private double balance;	//계좌
	
	Account(double balance) {
		this.balance = balance;
	}
	
	public void credit(double credit) {	//계좌에 입금
		balance = balance + credit;
	}
	
	protected void setBalance(double balance) {	//balance setter
		this.balance = balance;
	}
	
	public double getBalance() {	//balance getter
		return balance;
	}
	
	public void debit(double debit) throws Exception {	//계좌 출금
		balance -= debit;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	
}
