package managementsystem;

public class BookManagementSystem {

	public static void main(String[] args) {
		Library library=new Library();
		Book book1= new Book(1, "water", "gvs");
		Book book2=new Book(2, "fire", "kvs");
		Book book3=new Book(3, "sky", "mks");
		Book book4=new Book(4, "earth", "cks");
		Book book5=new Book(5, "light", "sks");
		
		library.addBook(book1);
		library.addBook(book2);
	    library.addBook(book3);
	    library.addBook(book4);
	    library.addBook(book5);
	    
	System.out.println("Books in the library:");
	
	for(Book book:library.getBooks()) {
		
		System.out.println(book.getTitle()  +" by " +  book.getAuthor() + " " +book.getId());
	}
	
	library.removeBook(book2);
	
	System.out.println("Books in the library after removing:"  +  book2.getTitle() ); 
	
	for(Book book :library.getBooks()) {
		
		System.out.println(book.getTitle()   + " by " +   book.getAuthor() +" "   +book.getId());
	}
	}
	
	}
	// output
//Books in the library:
//water by gvs 1
//fire by kvs 2
//sky by mks 3
//earth by cks 4
//light by sks 5
//Books in the library after removing:fire
//water by gvs 1
//sky by mks 3
//earth by cks 4
//light by sks 5


