package lab6;

public class BookShelf {

	public static void main(String[] args) {
		 Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);
	        Book book2 = new Book("1984", "George Orwell", "Secker & Warburg", 1949);

	        System.out.println("Book 1:");
	        System.out.println(book1);

	        System.out.println();

	        System.out.println("Book 2:");
	        System.out.println(book2);

	        System.out.println();

	        book1.setTitle("The Catcher in the Rye");
	        book1.setAuthor("J. D. Salinger");
	        book1.setPublisher("Little, Brown and Company");
	        book1.setCopyrightDate(1951);

	        book2.setTitle("Brave New World");
	        book2.setAuthor("Aldous Huxley");
	        book2.setPublisher("Chatto & Windus");
	        book2.setCopyrightDate(1932);
	       
	        System.out.println("Updated Book 1:");
	        System.out.println(book1);

	        System.out.println();

	        System.out.println("Updated Book 2:");
	        System.out.println(book2);

	}

}
