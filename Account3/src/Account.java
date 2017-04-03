
public abstract class Account implements Valuable{
	
	private double balance;	//����
	
	Account(double balance) {
		this.balance = balance;
	}
	
	public void credit(double credit) {	//���¿� �Ա�
		balance = balance + credit;
	}
	
	protected void setBalance(double balance) {	//balance setter
		this.balance = balance;
	}
	
	public double getBalance() {	//balance getter
		return balance;
	}
	
	public void debit(double debit) {	//���� ���
		
		if(balance - debit > 0) {	//����1�� �ܰ�Ȯ�� �� �۾�
			balance = balance - debit;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	
}
