
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

	public void passTime(int time) {
		this.time = this.time + time;
		if (this.time <= 12) {
			setBalance(getBalance() * Math.pow(1+interest, time));
		}
	}
}
