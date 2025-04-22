package Task2;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(String accountNumber, String accountHolderName, double initialBalance) throws InvalidAmountException {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		setBalance(initialBalance);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) throws InvalidAmountException {
		if(balance<0) {
			throw new InvalidAmountException("Invalid amount initial balance cannot be Negative");
		}else {
			this.balance=balance;
		}
	}
	public double checkBalance() {
		return getBalance();
	}
	public void withDraw(double amount) throws InSufficientFundsException, InvalidAmountException {
		if(amount>balance) {
			throw new InSufficientFundsException("Insufficient balance in the account");
		}
		if(amount%100!= 0) {
			throw new InvalidAmountException("Invalid, amount should be multiples of 100");
		}
		else if(amount<0) {
			throw new InvalidAmountException("Invalid, amount cannot be negative");
		}
		balance-=amount;
		System.out.println("Amount withdrawn successfully..!");
	}
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<0) {
			throw new InvalidAmountException("Invalid, amount cannot be negative");
		}else if(amount%100!= 0) {
			throw new InvalidAmountException("Invalid, amount should be multiples of 100");
		}
		balance+=amount;
		System.out.println("successfully deposited");
	}
	
}
