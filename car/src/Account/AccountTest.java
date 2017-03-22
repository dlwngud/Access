package Account;
import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		CheckingAccount account1 = new CheckingAccount();
		CheckingAccount account2 = new CheckingAccount();
		Scanner input = new Scanner(System.in);
		double num1 = input.nextInt();
		account1.credit(num1);
		System.out.printf("Account1 balance: %f",account1.getAccount());
		double num2 = input.nextInt();
		account2.credit(num2);
		System.out.printf("Account2 balance: %f",account2.getAccount());
		System.out.print("Enter deposit amount for Account1: ");
		double num3 = input.nextInt();
		account1.credit(num3);
		System.out.printf("Account1 balance: %f",account1.getAccount());
		System.out.printf("Account2 balance: %f",account2.getAccount());
		System.out.printf("Enter withdrawal amount for Account2: ");
		double num4 = input.nextInt();
		account2.debit(num4);
		System.out.print("next Month!\n");
		account1.nextMonth();
		account2.nextMonth();
		System.out.printf("Account1 balance: %f\n",account1.getAccount());
		System.out.printf("Account2 balance: %f\n",account2.getAccount());
	}

}
