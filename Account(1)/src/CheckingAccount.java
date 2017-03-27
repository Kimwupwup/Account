
public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	CheckingAccount(double balance, double creditLimit, double interest, double loanInterest) {
		super(balance);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	

	@Override
	public void debit(double debit) {
		
		if (debit > creditLimit) {
			System.out.println("��� �ѵ��� �Ѿ����ϴ�. ��� �ѵ� : " + creditLimit);
		} else {
			setBalance(getBalance() - debit);
			
			if (getBalance() < 0) {
				System.out.println("���̳ʽ� �Դϴ�!");
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
			//
		} 	
	}

}
