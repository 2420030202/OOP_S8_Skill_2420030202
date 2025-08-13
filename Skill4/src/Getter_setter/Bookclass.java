package Getter_setter;
public class Bookclass {
	private String title;
	private String author;
	private double price;
	public void Settitle(String title) {
		this.title=title;
	}
	public void Setauthor(String author) {
		this.author=author;
	}
	public void Setprice(double price) {
		this.price=price;
	}
	public String gettitle() {
		return title;
	}
	public String author() {
		return author;
	}
	public double price() {
		return price;
	}
	public String toString() {
        return "Book Title: "+title+"\nAuthor: "+author+"\nPrice: $"+price;
    }
}