
public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	private double balance1;
	private double balance2;
	
	CheckingAccount(double balance1, double balance2, double creditLimit, double interest, double loanInterest) {
		super(balance1, balance2);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}
	
	@Override
	public void debit1(double m) {
		if (m > creditLimit) {
			System.out.println("��� �ѵ��� �Ѿ����ϴ�. ��� �ѵ� : " + creditLimit);
		} else {
			System.out.println(balance2);
			balance1 = balance1 - m;
			setBalance(balance1, balance2);
			
			if (balance1 < 0) {
				System.out.println("���̳ʽ� �Դϴ�!");
			}
		}
	}
	
	@Override
	public void debit2(double m) {
		if (m > creditLimit) {
			System.out.println("��� �ѵ��� �Ѿ����ϴ�. ��� �ѵ� : " + creditLimit);
		} else {
			System.out.println(balance2);
			balance2 = balance2 - m;
			setBalance(balance1, balance2);
			
			if (balance2 < 0) {
				System.out.println("���̳ʽ� �Դϴ�!");
			}
		}
	}
}
