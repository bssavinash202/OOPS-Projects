package OPPSLIb;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;

	public Book(String title, String author, String iSBN, boolean isAvailable) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.isAvailable = isAvailable;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String toString() {
		return "Name: \""+getTitle()+"\" Author: \""+getAuthor()+"\" ISBN: \""+getISBN()+"\" isAvailable: \""+isAvailable()+"\"";
	}
	

}
