package OPPSLIb;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library lb = new Library();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {

				System.out.println(
						"1. Add Book\n2. Remove Book\n3. CheckOut\n4. Return Book\n5. Show all Books\n6. Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter the Book Name: ");
					String name = sc.next();
					sc.nextLine();
					System.out.print("Enter the Author Name: ");
					String author = sc.nextLine();
					System.out.print("Enter the ISBN: ");
					String isbn = sc.nextLine();
					boolean yes = true;
					Book b1 = new Book(name, author, isbn, yes);
					lb.addBook(b1);
					break;
				case 2:
					System.out.print("Enter ISBN: ");
					String remove = sc.next();
					sc.nextLine();
					lb.removeBook(remove.trim());
					break;
				case 3:
					System.out.print("Enter ISBN: ");
					String checkout = sc.next();
					sc.nextLine();
					lb.checkOut(checkout.trim());
					break;
				case 4:
					System.out.print("Enter ISBN: ");
					String rtn = sc.next();
					sc.nextLine();
					lb.returnBook(rtn.trim());
					break;
				case 5:
					System.out.println("------List of All Books------");
					lb.displayAllBooks();
					break;
				case 6:System.out.println("Exiting..!");
					return;
				default:
					System.out.println("Invalid choice..!");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
