public class Account {
	
	private double account1;	//���� 1
	private double account2;	//���� 2
	
	public void addMoney(double acc1, double acc2) {	//���¿� �Ա�
		account1 = acc1;
		account2 = acc2;
	}		
		
	public double chkBalance(int num) {	//balance üũ
		if(num == 1) {
			return account1;
		} else if(num == 2) {
			return account2;
		}
		return 0;
	}
	
	public void debitAccount1(double debit1) {	//����1 ���
		
		if(account1 - debit1 > 0) {	//����1�� �ܰ�Ȯ�� �� �۾�
			account1 = account1 - debit1;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
	
	public void debitAccount2(double debit2) {	//����1 ���		
		
		if(account2 - debit2 > 0) {	//����2�� �ܰ� Ȯ�� �� �۾�
			account2 = account2 - debit2;
		} else {
			System.out.println("Debit amount exceed account balance.");
		}
	}
}
