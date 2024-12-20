package Collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


class Book{
	private String author;
	private double price;
	public Book(String author, double price) {
		super();
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", price=" + price + "]";
	}
}

class BookStore {
	private SortedMap<String , Book> bookMap;
	
	public BookStore() {
		bookMap = new TreeMap<String , Book>();
	}
	
	public void addBook(String title , String author , double price) {
		Book book = new Book(author , price);
		bookMap.put(title ,book);
	}
	
	public void display() {
		for(Map.Entry<String, Book> entry  : bookMap.entrySet()) {
			System.out.println("Title : "+ entry.getKey() + "  "+ entry.getValue());
		}
		
	}
	
	public void displayBookInRange(String formTitle , String toTitle) {
		SortedMap<String , Book> subMap = bookMap.subMap(formTitle, toTitle);
		System.out.println("Book in the range : ");
		for(Map.Entry<String, Book>  entry : subMap.entrySet()) {
			System.out.println("Title  : "+entry.getKey() +  " "+ entry.getValue());
		}
	}
	
	public void getFirstBook() {
		System.out.println("First Book : " + bookMap.firstKey() + " " + bookMap.get(bookMap.firstKey()));
	}
	
	public void getLastBook() {
		System.out.println("Last Book : " + bookMap.lastKey() + " " + bookMap.get(bookMap.lastKey()));
	}
}

public class SortedMapExample {

	public static void main(String[] args) {
	  BookStore store = new BookStore();
	  
	  store.addBook("Aasai", "Preethivi", 120);
	  store.addBook("Chindhamani", "Nithis", 10);
	  store.addBook("Agananooru", "Vijay", 150);
	  store.addBook("Purananooru", "Ragu", 1000);
	  store.addBook("Silappatikaram" , "Sathish" , 2000);
	  store.addBook("Thirukural", "Rajini", 100);
	  store.addBook("Kamabaramayanam", "Ramar", 150);
	  
	  store.display();
	  
	  store.getFirstBook();
	  store.getLastBook();
	  
	  store.displayBookInRange("Aasai", "Purananooru");
	}

}
