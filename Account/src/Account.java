
public class Account {
	private double balance1;	//���� 1
	private double balance2;	//���� 2
	
	Account(double balance1, double balance2) {
		this.balance1 = balance1;
		this.balance2 = balance2;
	}
	
	public void credit(double acc1, double acc2) {	//���¿� �Ա�
		balance1 = balance1 + acc1;
		balance2 = balance2 + acc2;
	}
	
	protected void setBalance(double balance1, double balance2) {
		this.balance1 = balance1;
		this.balance2 = balance2;
	}
	
	public double getBalance(int num) {	//balance üũ
		if(num == 1) {
			return balance1;
		} else if(num == 2) {
			return balance2;
		}
		return 0;
	}
	
	public void debit1(double debit1) {	//����1 ���
		
		if(balance1 - debit1 > 0) {	//����1�� �ܰ�Ȯ�� �� �۾�
			balance1 = balance1 - debit1;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public void debit2(double debit2) {	//����1 ���		
		
		if(balance2 - debit2 > 0) {	//����2�� �ܰ� Ȯ�� �� �۾�
			balance2 = balance2 - debit2;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}

}
