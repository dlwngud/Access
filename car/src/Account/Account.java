package Account;

public class Account {
	protected double account= 0.00;
	
	public void credit (double money){
		account = account + money;
	}
	public void debit(double money){
		if (account<0){
			account = account - money;
			System.out.print("�ܾ��� 0���� �۽��ϴ�.\n");
		}else{
			account = account - money;
		}
			
		}
	public double getAccount(){
		return account;
	}
	
	
	protected void setBalance(double m){
		account=m;
	}
	
}
