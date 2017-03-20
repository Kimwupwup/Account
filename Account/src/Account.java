
public class Account {
	private double balance1;	//계좌 1
	private double balance2;	//계좌 2
	
	Account(double balance1, double balance2) {
		this.balance1 = balance1;
		this.balance2 = balance2;
	}
	
	public void credit(double acc1, double acc2) {	//계좌에 입금
		balance1 = balance1 + acc1;
		balance2 = balance2 + acc2;
	}
	
	protected void setBalance(double balance1, double balance2) {
		this.balance1 = balance1;
		this.balance2 = balance2;
	}
	
	public double getBalance(int num) {	//balance 체크
		if(num == 1) {
			return balance1;
		} else if(num == 2) {
			return balance2;
		}
		return 0;
	}
	
	public void debit1(double debit1) {	//계좌1 출금
		
		if(balance1 - debit1 > 0) {	//계좌1에 잔고확인 후 작업
			balance1 = balance1 - debit1;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public void debit2(double debit2) {	//계좌1 출금		
		
		if(balance2 - debit2 > 0) {	//계좌2에 잔고 확인 후 작업
			balance2 = balance2 - debit2;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}

}
