package OPPSLIb;

public class Library {

	Book[] books = new Book[100];
	int count = 0;

	public void addBook(Book book) throws DuplicateBookException {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(book.getISBN())) {
				throw new DuplicateBookException("Duplicate Book");
			}
		}
		books[count++] = book;
		System.out.println("Book Added Successfully..!");
	}

	public void displayAllBooks() {
		if(count==0) {
			System.out.println("NO BOOKS AVAILABLE");
		}else if(count>0) {
			for (int i = 0; i < count; i++) {
				System.out.println(books[i].toString());
			}
		}
		
	}

	public void removeBook(String ISBN) throws BookNotFoundException {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				for(int j=i;j<count-1;j++) {
					books[j] = books[j + 1];
				}
				books[--count]=null;
				System.out.println("book removed successfully");
				return;
			} 
		}
		throw new BookNotFoundException("Book not found");
	}

	public void checkOut(String ISBN) throws BookUnavailableException, BookNotFoundException {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				if (books[i].isAvailable()) {
					books[i].setAvailable(false);
					System.out.println("Book Successfully checked out");
					return;
				} else if (!books[i].isAvailable()) {
					throw new BookUnavailableException("Book is Already Checked out");
				}
			}
		}
		throw new BookNotFoundException("Book not found..!");
	}

	public void returnBook(String ISBN) throws BookNotFoundException, DuplicateBookException {
		for (int i = 0; i < count; i++) {
			if (books[i].getISBN().equals(ISBN)) {
				if (!books[i].isAvailable()) {
					books[i].setAvailable(true);
					System.out.println("Book Returned successfully..!");
					return;
				} else if (books[i].isAvailable()) {
					throw new DuplicateBookException("Book is already available Duplicate Book");
				}
			}
		}
		throw new BookNotFoundException("Book Not found...!");
	}

}
