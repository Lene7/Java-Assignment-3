//34317996
//L Kriel
//Assignment 3

public class Book extends Item
{
	private String publisher;
	private int numPages;
	
	public Book()
	{
		
	}
	
	public Book(String title, String author, String year, String publisher, int numPages, Boolean isAvailable)
	{
		super(title, author, year, isAvailable);
		this.publisher = publisher;
		this.numPages = numPages;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}
	
	public String getPublisher()
	{
		return this.publisher;
	}
	
	public int getNumPages()
	{
		return this.numPages;
	}
	
	public String toString()
	{
		return "Book:\n\tTitle: " + this.getTitle() +"\n\tAuthor: " + this.getAuthor() + "\n\tYear: " + this.getYear() + "\n\tPublisher: " + this.getPublisher() + "\n\tNum Pages: " + this.getNumPages() + "\n\tIs Available: " + this.getIsAvailable();
	}
	
}