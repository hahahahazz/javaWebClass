package day02;

public class book {

	String name;
	String author;
	String genre;
	String price;
	
	public book(String name, String author, String genre, String price) {
		super();
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [name=" + name + ", author=" + author + ", genre=" + genre + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
}
