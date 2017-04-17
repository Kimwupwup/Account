
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
	
	@Override
	public void credit(double credit) {	//계좌에 입금
		setBalance(getBalance() + credit);
		creditLimit += credit;
	}
	
	public boolean isBankrupted() {
		if(creditLimit <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void passTime() {
		if (getBalance() < 0) {
			creditLimit = creditLimit + (getBalance() * (1+loanInterest) - getBalance());
			setBalance(getBalance() * (1+loanInterest));
			if(isBankrupted() == true) {
				creditLimit = 0.0;
			}
		} else {
			creditLimit = creditLimit + (getBalance() *(1+interest) - getBalance());
			setBalance(getBalance() * (1+interest));
		}
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
		
	public double EstimateValue() {
		if (getBalance() < 0) {
			creditLimit = creditLimit + (getBalance() * (1+loanInterest) - getBalance());
			setBalance(getBalance() * (1+loanInterest));
			if(isBankrupted() == true) {
				creditLimit = 0.0;
			}
		} else {
			creditLimit = creditLimit + (getBalance() * (1+interest) - getBalance());
			setBalance(getBalance() * (1+interest));
		}
		return getBalance();
	}
	
	public double EstimateValue(int time) {
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
		return getBalance();
	}
	
	public String toString() {
		return String.format("CheckingAccount_Balance: " + getBalance());
	}
}

