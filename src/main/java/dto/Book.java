package dto;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID=-4274700572038677000L;

	private String bookId;
	private String name;
	private int unitPrice;
	private String author;
	private String description;
	private String publisher;
	private String category;
	private long unitsInStock;
	private String releaseDate;
	private String condition;

	public Book() {
		super();
	}

	public Book(String bookId, String name, Integer unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getBookId() { return bookId; }
	
	public void setBookId(String bookId) {
		this.bookId=bookId;
	}
	
	public String getname() { return name; }
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getunitPrice() { return unitPrice; }
	
	public void setunitPrice(int unitPrice) {
		this.unitPrice=unitPrice;
	}
	
	public String getauthor() { return author; }
	
	public void setauthor(String author) {
		this.author=author;
	}
	
	public String getdescription() { return description; }
	
	public void setdescription(String description) {
		this.description=description;
	}
	
	public String getpublisher() { return publisher; }
	
	public void setpublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public String getcategory() { return category; }
	
	public void setcategory(String category) {
		this.category=category;
	}
	
	public long getunitsInStock() { return unitsInStock; }
	
	public void setunitsInStock(long unitsInStock) {
		this.unitsInStock=unitsInStock;
	}
	
	public String getreleaseDate() { return releaseDate; }
	
	public void setreleaseDate(String releaseDate) {
		this.releaseDate=releaseDate;
	}
	
	public String getcondition() { return condition; }
	
	public void setcondition(String condition) {
		this.condition=condition;
	}
}