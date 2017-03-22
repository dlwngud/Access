package Account;

public class Account {
	public void credit (double money){
		account = account + money;
	}
	public void debit(double money){
		if (account<0){
			System.out.print("Debit exceeded account balance\n");
		}else{
			account = account - money;
		}
			
		}
	
	private double account= 0.00;
	public double getAccount(){
		return account;
	}
	
	

}
