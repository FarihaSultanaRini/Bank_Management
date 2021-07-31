public class CurrentAccount extends  BankAccountAbstraceClass{

	public CurrentAccount(String name,String accountType,String password, double accountBalance,String address) {
		super(name, accountType, password, accountBalance);
	}

	@Override
	public String withdraw(double amount) {
		
		if(accountBalance>=amount && 100<=(accountBalance-amount))
		{
			
			accountBalance-=amount;
			System.out.println("done");
			return "";
		}
		else {
		return "Insufficient balance";
		}
	}
	

}
