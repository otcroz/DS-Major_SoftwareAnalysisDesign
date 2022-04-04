package ch01.pratice.iterator;

public class Main {
	public static void main(String[] args) {
		
		BookShelf bookshelf = new BookShelf(4);

		bookshelf.appendBook(new Book("유수연"));
		bookshelf.appendBook(new Book("아몬드"));
		bookshelf.appendBook(new Book("나미야의 잡화상점"));
		
		Iterator it = bookshelf.iterator();
		
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());	
		}
		
		it = bookshelf.iterator2();
		while(it.hasNext()) {
			System.out.println(((Book)it.next()).getName());
		}
	
	}
}
