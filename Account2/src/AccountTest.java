import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Account account1 = new CheckingAccount(100.0, 50.0, 0.01, 0.07);
		Account account2 = new SavingsAccount(100.0, 0.05);
		//ChekingAccount
		System.out.println("Account1 balance : $" + account1.getBalance() + "현재 출금가능액 : " + account1.getWithdrawableAccount());
		
		System.out.print("Enter withdrawal amount for Account1 : $");
		double debit = scanner.nextDouble();
		System.out.println("Subtracting $" + debit + " from Account1");
		account1.debit(debit);


		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if (((CheckingAccount)account1).isBankrupted() == true) {
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if (((CheckingAccount)account1).isBankrupted() == true) {
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", account1.getBalance(), account1.getWithdrawableAccount());
		if (((CheckingAccount)account1).isBankrupted() == true) {
			System.out.println("account1 went Bankrupt!");
		}
		
		
		//SavingsAccount
		System.out.println();
		System.out.printf("Account2 balance : $ %.2f \t현재출금가능액 : $ %.2f\n", 
				account2.getBalance(), account2.getWithdrawableAccount());
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance : $ %.2f \t현재출금가능액 : $ %.2f\n", 
				account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance : $ %.2f \t현재출금가능액 : $ %.2f\n", 
				account2.getBalance(), account2.getWithdrawableAccount());

		System.out.println("1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance : $ %.2f \t현재출금가능액 : $ %.2f\n", 
				account2.getBalance(), account2.getWithdrawableAccount());
		account2.debit(50);
		
		System.out.printf("Account2 balance : $ %.2f \t현재출금가능액 : $ %.2f\n", 
				account2.getBalance(), account2.getWithdrawableAccount());

	}
}	
