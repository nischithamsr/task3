package managementsystem;
import java.util.ArrayList;

public class Library {

	public ArrayList<Book>books;
	
	public Library(){
   books=new ArrayList<Book>();
	}
	public void addBook(Book book) {
		books.add(book);
		
	}
	public void remove(Book book) {
		books.remove(book);
	}
	public ArrayList <Book> getBooks(){
		return books;
	}
	public void removeBook(Book book2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	}
