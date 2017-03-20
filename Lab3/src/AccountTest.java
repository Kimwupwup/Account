import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Account account = new Account();
		
		//돈입력 후 값들 Account에 저장
		System.out.print("Enter the Account1 : $");
		double acc1 = input.nextDouble();
		System.out.print("Enter the Account2 : $");
		double acc2 = input.nextDouble();
		
		account.addMoney(acc1, acc2);
		
		
		
		System.out.println("Account1 balance : $" + account.chkBalance(1));
		System.out.println("Account2 balance : $" + account.chkBalance(2));
		
		
		
		System.out.print("Enter withdrawal amount for Account1 : $");
		double debit1 = input.nextDouble();
		System.out.println("Subtracting $" + debit1 + " from Account1");
		
		account.debitAccount1(debit1);
		
		System.out.println("Account1 balance : $" + account.chkBalance(1));
		System.out.println("Account2 balance : $" + account.chkBalance(2));
		
		
		
		System.out.print("Enter withdrawal amount for Account2 : $");
		double debit2 = input.nextDouble();
		System.out.println("Subtracting $" + debit2 + " from Account2");
		
		account.debitAccount2(debit2);
		
		System.out.println("Account1 balance : $" + account.chkBalance(1));
		System.out.println("Account2 balance : $" + account.chkBalance(2));
	}
}
