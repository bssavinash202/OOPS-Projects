package Task2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			BankAccount b = new BankAccount("Ac111","avinash",1000);
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Atm System "+b.getAccountHolderName());
			while(true) {
				System.out.println("1. Check Balance\n2. With draw\n3. Deposit\n4. Exit");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				switch(choice) {
				case 1: System.out.println("Your Current balance is "+b.checkBalance());break;
				case 2: System.out.print("Enter amount to withDraw: ");
						b.withDraw(sc.nextDouble()); break;
				case 3: System.out.print("Enter amount to deposit: ");
						b.deposit(sc.nextDouble());break;
				case 4: System.out.println("Exiting the system...!");return;
				default: System.err.println("X Invalid Choice X");
				}
			}
		} catch (InvalidAmountException | InSufficientFundsException e) {
		System.err.println(e.getMessage());
		}
		
	}
}	
