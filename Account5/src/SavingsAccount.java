
public class SavingsAccount extends Account{

	private double creditLimit;
	private int time;
	private double interest;
	
	public SavingsAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
	}

	@Override
	public void debit(double debit) throws Exception {
		if (this.time  < 12) {
			throw new Exception("���� ��� �� �� �����ϴ�.\n");
			
		} else if (debit < 0) {
			throw new Exception("���� �Է�!\n");
			
		} else {
			setBalance(getBalance() - debit);
			
		}
	}
	
	public double getWithdrawableAccount() {
		if (this.time > 12) {
			creditLimit = getBalance();
			return creditLimit;
		} else {
			return 0.0;
		}
	}
	
	public void passTime() {
		this.time = this.time + 1;
		if (this.time >= 12) {
			setBalance(getBalance() * (1+interest));
		}
	}
	
	public void passTime(int time) {
		this.time = this.time + time;
		if (this.time >= 12) {
			setBalance(getBalance() * Math.pow(1+interest, time));
		}
	}

	public double EstimateValue() {
		this.time = this.time + 1;
		if (this.time <= 12) {
			setBalance(getBalance() * (1+interest));
		}
		return getBalance();
	}
	
	public double EstimateValue(int time) {
		this.time = this.time + time;
		if (this.time <= 12) {
			setBalance(getBalance() * Math.pow(1+interest, time));
		}
		return getBalance();
	}
	
	public String toString() {
		return String.format("SavingsAccount_Balance: " + getBalance());
	}
}
