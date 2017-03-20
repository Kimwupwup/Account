
public class Account {
	
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
	
	public void debit(double debit) {	//계좌 출금
		
		if(balance - debit > 0) {	//계좌1에 잔고확인 후 작업
			balance = balance - debit;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}

}
