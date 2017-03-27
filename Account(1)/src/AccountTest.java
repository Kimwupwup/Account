import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CheckingAccount chkAccount1 = new CheckingAccount(100.0, 150.0, 0.01, 0.07);
		
		//출력
		System.out.println("Account1 balance : $" + chkAccount1.getBalance() + "현재 출금가능액 : " + chkAccount1.getWithdrawableAccount());
		
		//출금
		System.out.print("Enter withdrawal amount for Account1 : $");
		double debit = scanner.nextDouble();
		System.out.println("Subtracting $" + debit + " from Account1");
		chkAccount1.debit(debit);


		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", chkAccount1.getBalance(), chkAccount1.getWithdrawableAccount());
		chkAccount1.passTime(1);
		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", chkAccount1.getBalance(), chkAccount1.getWithdrawableAccount());
		chkAccount1.passTime(5);
		System.out.printf("Account1 balance : $ %.2f \t현재 출금가능액 : $ %.2f\n", chkAccount1.getBalance(), chkAccount1.getWithdrawableAccount());
		
		
		//이자계산
		chkAccount1.nextMonth();

		
		System.out.println("Next Month!");
		System.out.println("Account1 balance : $" + chkAccount1.getBalance());

		
	}
}	
