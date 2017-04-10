
public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	CheckingAccount(double balance, double creditLimit, double interest, double loanInterest) {
		super(balance);
		this.creditLimit = getBalance() + creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	

	@Override
	public void debit(double debit) throws Exception {
		
		if (debit > creditLimit) {
			throw new Exception("Debit amount exceeded account balance.\n");
			
		} else if (debit < 0) {
			throw new Exception("음수입력!\n");
			
		} else {
			setBalance(getBalance() - debit);
			creditLimit = creditLimit - debit;
			
			if (getBalance() < 0) {
				throw new Exception("마이너스 입니다!\n");
				
			}
		}
	}
	
	public void nextMonth() {
		if (getBalance() > 0) {
			double bal = getBalance();
			bal = bal + bal * interest;
			setBalance(bal);
		} else {
			double bal = getBalance();
			bal = bal + bal * loanInterest;
			setBalance(bal);
		} 	
	}
	
	public double getWithdrawableAccount() {
		return creditLimit;
	}
	
	public void passTime(int time) {
		if (getBalance() < 0) {
			creditLimit = creditLimit + (getBalance() * Math.pow(1+loanInterest, time) - getBalance());
			setBalance(getBalance() * Math.pow(1+loanInterest, time));
			if(isBankrupted() == true) {
				creditLimit = 0.0;
			}
		} else {
			creditLimit = creditLimit + (getBalance() * Math.pow(1+interest, time) - getBalance());
			setBalance(getBalance() * Math.pow(1+interest, time));
		}
	}
	
	public boolean isBankrupted() {
		if(creditLimit <= 0) {
			return true;
		} else {
			return false;
		}
	}
}

