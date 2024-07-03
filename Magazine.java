//34317996
//L Kriel
//Assignment 3

public class Magazine extends Item
{
	private String issueNumber;
	
	public Magazine()
	{
		
	}
	
	public Magazine(String title, String author, String year, String issueNumber, Boolean isAvailable)
	{
		super(title, author, year, isAvailable);
		this.issueNumber = issueNumber;
	}
	
	public void setIssueNumber(String issueNumber)
	{
		this.issueNumber = issueNumber;
	}
	
	public String getIssueNumber()
	{
		return this.issueNumber;
	}
	
	public String toString()
	{
		return "Magazine:\n\tTitle: " + this.getTitle() +"\n\tAuthor: " + this.getAuthor() + "\n\tYear: " + this.getYear() + "\n\tIssue Number: " + this.getIssueNumber() + "\n\tIs Available: " + this.getIsAvailable();
	}	
}