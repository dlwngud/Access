package Account;

public class AccountTest {
	public static void main(String[] args){
		Account account1 = new Account();
		Account account2 = new Account();
		account1.credit(50);
		System.out.printf("account1 balacne: %f\n",account1);
		account2.debit(30);
		
	}

}
