package OPPSBank;

public class BankAccount {
	private String accountNum;
	private String accountHolderName;
	private double balance;
	
	
	public BankAccount(String accountNum, String accountHolderName, double initialBalance) throws InvalidAmountException {
		this.accountHolderName=accountHolderName;
		this.accountNum=accountNum;
		setBalance(initialBalance);
	}
	public String getAccountNum() {
		return accountNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double initialBalance)throws InvalidAmountException {
		if(initialBalance<0) {
			throw new InvalidAmountException("Initial balance cannot be Negative");
		}else {
			this.balance=initialBalance;
		}
	}
	
	public double checkBalance() {
		return getBalance();
	}
	public void withDraw(double amount) throws InsufficientFundsException, InvalidAmountException{
		if(amount%100!=0) {
			throw new InvalidAmountException("Invalid amount should be multiples of 100");
		}
	else if(amount<0) {
			throw new InvalidAmountException("Invalid amount to withdraw cannot be negative");
		}
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		balance-=amount;
		System.out.println("Withdrawn amount new balance: "+balance);
	}
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<0) {
			throw new InvalidAmountException("Invalid amount cannot be negative");
		}else if(amount%100!=0){
			throw new InvalidAmountException("Invalid amount to deposit multiples of 100");
		}else {
			balance+=amount;
			System.out.println("Amount deposited successfully new balance: "+balance);
		}
	}
	
}
