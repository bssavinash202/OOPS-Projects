package OPPSBank;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		try {
			BankAccount ac = new BankAccount("1234", "Avinash", 10000);
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Bank App: "+ac.getAccountHolderName());
			while(true) {
				System.out.println("1. CheckBalance\n2. WithDraw\n3. Deposit\n4. Exit");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: System.out.println("Balance: "+ac.getBalance());break;
				case 2: System.out.print("Enter the amountv to withdraw: ");
						double amount = sc.nextDouble();
						ac.withDraw(amount);break;
				case 3: System.out.print("Enter the amountv to deposit: ");
						double amountw = sc.nextDouble();
						ac.deposit(amountw);break;
				case 4: return;
				default: System.err.println("Invalid choice");
				sc.close();
				}
			}
			
		} catch (InsufficientFundsException ie) {
			ie.printStackTrace();
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}
