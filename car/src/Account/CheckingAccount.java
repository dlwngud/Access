package Account;

class CheckingAccount extends Account {
	private double credit_limit;
	public double getCredit(){
		return credit_limit;
	}
	private double interest = 0.1;
	public double getInter(){
		return interest;
	}
	private double loan_interest = 0.07;
	public double getLoan(){
		return loan_interest;
	}
	@Override public void debit(double money){
		if (account<credit_limit){
			System.out.print("한도 초과.\n");
		}
	}
	public void nextMonth (){
		if (account<0){
			account = account + account*loan_interest;
		}else if (account>0){
			account =account + account*interest;
		}
		
	}
	
}
