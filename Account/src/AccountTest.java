import java.util.Scanner;

public class AccountTest {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Account account = new Account(100.0, 100.0);
		
		
		//돈입력 후 값들 Account에 저장
		System.out.print("Enter deposit amount for Account1 : $");
		double acc1 = input.nextDouble();
		System.out.print("Enter deposit amount for Account2 : $");
		double acc2 = input.nextDouble();
		
		account.credit(acc1, acc2);
		
		CheckingAccount chk = new CheckingAccount(account.getBalance(1), account.getBalance(2), 200.0, 0.1, 0.1);
		
		//출력
		System.out.println("Account1 balance : $" + account.getBalance(1));
		System.out.println("Account2 balance : $" + account.getBalance(2));
		
		
		//출금
		System.out.print("Enter withdrawal amount for Account1 : $");
		double debit1 = input.nextDouble();
		System.out.println("Subtracting $" + debit1 + " from Account1");
		
		chk.debit1(debit1);
		
		System.out.println("Account1 balance : $" + account.getBalance(1));
		System.out.println("Account2 balance : $" + account.getBalance(2));
		
		
		
		System.out.print("Enter withdrawal amount for Account2 : $");
		double debit2 = input.nextDouble();
		System.out.println("Subtracting $" + debit2 + " from Account2");
		
		chk.debit2(debit2);
		
		System.out.println("Account1 balance : $" + account.getBalance(1));
		System.out.println("Account2 balance : $" + account.getBalance(2));
	}
}	
