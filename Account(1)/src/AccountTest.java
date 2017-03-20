import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CheckingAccount chkAccount1 = new CheckingAccount(100.0, 200.0, 0.1, 0.1);
		CheckingAccount chkAccount2 = new CheckingAccount(100.0, 200.0, 0.1, 0.1);
		
		//출력
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());
		System.out.println("Account2 balance : $" + chkAccount2.getBalance());
		
		
		//돈입력 후 값들 Account에 저장
		System.out.print("Enter deposit amount for Account1 : $");
		double acc1 = scanner.nextDouble();
		chkAccount1.credit(acc1);
		System.out.print("Enter deposit amount for Account2 : $");
		double acc2 = scanner.nextDouble();
		chkAccount2.credit(acc2);
		
		
		
		//출력
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());
		System.out.println("Account2 balance : $" + chkAccount2.getBalance());
		
		
		
		//출금
		System.out.print("Enter withdrawal amount for Account1 : $");
		double debit = scanner.nextDouble();
		System.out.println("Subtracting $" + debit + " from Account1");
		chkAccount1.debit(debit);

		
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());
		System.out.println("Account2 balance : $" + chkAccount2.getBalance());
		
		
		System.out.print("Enter withdrawal amount for Account2 : $");
		debit = scanner.nextDouble();
		System.out.println("Subtracting $" + debit + " from Account2");
		chkAccount2.debit(debit);
		
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());
		System.out.println("Account2 balance : $" + chkAccount2.getBalance());
		
		
		
		//이자계산
		chkAccount1.nextMonth();
		chkAccount2.nextMonth();
		
		System.out.println("Next Month!");
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());
		System.out.println("Account1 balance : $" + chkAccount2.getBalance());
		
	}
}	
