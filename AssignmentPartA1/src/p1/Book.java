package p1;
import java.util.Formatter;

public class Book {
	private String title;
	private String author;
	private double price;
	private int stock;
	Formatter f = new Formatter();
	
	public Book (String t, String a, double p, int s){
		title = t;
		author = a;
		price = p;
		stock = s;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public double getPrice(){
		return price;
	}
	public int getStock(){
		return stock;
	}
	public void setPrice(double p){
		price = p;
	}
	public String toString(){
		f.format("The book's title is " + getTitle() + ", it's author is " + getAuthor() + " it's price is " + getPrice() + " " + getStock() + " in stock");
		String s = f.toString();
		return (s);
	}

}
