
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
	public void debit(double debit) {
		if (debit > creditLimit) {
			System.out.println("출금 한도를 넘었습니다. 출금 한도 : " + creditLimit);
		} else {
			setBalance(getBalance() - debit);
			creditLimit = creditLimit - debit;
			
			if (getBalance() < 0) {
				System.out.println("마이너스 입니다!");
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

