public class Account {
	
	private double account1;	//계좌 1
	private double account2;	//계좌 2
	
	public void addMoney(double acc1, double acc2) {	//계좌에 입금
		account1 = acc1;
		account2 = acc2;
	}		
		
	public double chkBalance(int num) {	//balance 체크
		if(num == 1) {
			return account1;
		} else if(num == 2) {
			return account2;
		}
		return 0;
	}
	
	public void debitAccount1(double debit1) {	//계좌1 출금
		
		if(account1 - debit1 > 0) {	//계좌1에 잔고확인 후 작업
			account1 = account1 - debit1;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public void debitAccount2(double debit2) {	//계좌1 출금		
		
		if(account2 - debit2 > 0) {	//계좌2에 잔고 확인 후 작업
			account2 = account2 - debit2;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
}
