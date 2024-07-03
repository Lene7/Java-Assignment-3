//34317996
//L Kriel
//Assignment 3

public class TestItem
{
	
	public static void main(String[] args)
	{
		//Test Item
		Item i1 = new Item("To Kill a Mockingbird", "Harper Lee", "1960", true);
		System.out.println(i1);
		
		Item i2 = new Item();
		
		i2.setTitle("The Great Gatsby");
		i2.setAuthor("F. Scott Fitzgerald");
		i2.setYear("1925");
		i2.setIsAvailable(false);
		
		System.out.println("Item:\n\tTitle: " + i2.getTitle() +"\n\tAuthor: " + i2.getAuthor() + "\n\tYear: " + i2.getYear() + "\n\tIs Available: " + i2.getIsAvailable());
		
		//Test Magazine
		Magazine m1 = new Magazine("Time", "Various", "2024", "20", true);
		System.out.println(m1);
		
		//Test Book
		Book b1 = new Book("The Catcher in the Rye", "J.D. Salinger", "1951", "Little, Brown and Company", 277, true);
		System.out.println(b1);
		
		//Test Reference Book
		ReferenceBook rb1 = new ReferenceBook("The Catcher in the Rye", "J.D. Salinger", "1951", "Little, Brown and Company", 277, "978-0316769488", false);
		System.out.println(rb1);
		
	}
}