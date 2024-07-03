//34317996
//L Kriel
//Assignment 3

public class Item
{
	private String title, author, year;
	private Boolean isAvailable;
	
	public Item()
	{
		
	}
	
	public Item(String title, String author, String year, Boolean isAvailable)
	{
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
		public void setAuthor(String author)
	{
		this.author = author;
	}
	
		public void setYear(String year)
	{
		this.year = year;
	}
	
		public void setIsAvailable(Boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public String getYear()
	{
		return this.year;
	}
	
	public Boolean getIsAvailable()
	{
		return this.isAvailable;
	}
	
	public String toString()
	{
		return "Item:\n\tTitle: " + this.getTitle() +"\n\tAuthor: " + this.getAuthor() + "\n\tYear: " + this.getYear() + "\n\tIs Available: " + this.getIsAvailable();
	}
	
}