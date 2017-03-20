
public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	private double bal;
	
	CheckingAccount(double balance, double creditLimit, double interest, double loanInterest) {
		super(balance);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	

	@Override
	public void debit(double debit) {
		bal = getBalance();
		
		if (debit > creditLimit) {
			System.out.println("출금 한도를 넘었습니다. 출금 한도 : " + creditLimit);
		} else {
			bal = bal - debit;
			
			setBalance(bal);
			
			if (bal < 0) {
				System.out.println("마이너스 입니다!");
			}
		}
	}
	
	public void nextMonth() {
		if (bal > 0) {
			bal = bal + bal * interest;
			setBalance(bal);
		} else if (bal < 0) {
			bal = bal + bal * loanInterest;
			setBalance(bal);
		} 	
	}

}
