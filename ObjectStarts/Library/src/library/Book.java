package library;

public class Book {

	private String name;
	private String author;
	private int price;
	private int books;
	
	public Book(String name,String author,int price,int books) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.books = books;
	}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getAuthor() {
			return author;
		}
		public void setPrice(int price) {
			this.price =price;
		}
		public int getPrice() {
			return price;
		}
		public void setBooks(int books) {
			this.books =books;
		}
		public int getBooks() {
			return books;
		}
	
}
