import java.io.Serializable;
import java.util.Random;
public abstract class BankAccountAbstraceClass implements Serializable  {

	public String name,id,password,accountType;
	double accountBalance;


	public BankAccountAbstraceClass(String name,String accountType,String password, double accountBalance) {
		this.name = name;
		this.accountType = accountType;
		this.password = password;
		Random rand=new Random();
		this.id =""+ rand.nextInt(10)+ rand.nextInt(10)+ rand.nextInt(10) ; 
		this.accountBalance = accountBalance;
	}
	
	void deposit(double amount) {

		accountBalance+=amount;
		System.out.println("deposit done");
	}
	abstract public String withdraw(double amount);
}
