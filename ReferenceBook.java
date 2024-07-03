//34317996
//L Kriel
//Assignment 3

public class ReferenceBook extends Book
{
	private String ISBN;
	
	public ReferenceBook()
	{
		
	}
	
	public ReferenceBook(String title, String author, String year, String publisher, int numPages, String ISBN, Boolean isAvailable)
	{
		super (title, author, year, publisher, numPages, isAvailable);
		this.ISBN = ISBN;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public String getISBN()
	{
		return this.ISBN;
	}
	
	public String toString()
	{
		return "Reference Book:\n\tTitle: " + this.getTitle() +"\n\tAuthor: " + this.getAuthor() + "\n\tYear: " + this.getYear() + "\n\tPublisher: " + this.getPublisher() + "\n\tNum Pages: " + this.getNumPages() + "\n\tISBN: " + this.getISBN() + "\n\tIs Available: " + this.getIsAvailable();
	}
}