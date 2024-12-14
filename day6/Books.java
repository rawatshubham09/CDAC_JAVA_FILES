package day6;

public class Books {
	int price;
	String name;
	String isbn;
	
	public Books() {
		super();
	}
	public Books(int Price, String Name, String Isbn)
	{	
		super();
		this.price = Price;
		this.name = Name;
		this.isbn = Isbn;
	}
	
	public String toString()
	{
		return this.price + " " + this.name + " " + this.isbn;
	}
}
