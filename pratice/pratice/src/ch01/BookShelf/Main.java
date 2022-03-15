package ch01.BookShelf;

public class Main {
	public static void main(String[] args) {
		BookShelf bookshelf = new BookShelf(4);
		
		// BookShelf에 넣기
		bookshelf.appendBook(new Book("아몬드", "손원평"));
		bookshelf.appendBook(new Book("나미야 잡화점의 기적", "히가시노 케이코"));
		bookshelf.appendBook(new Book("유수연", "멋져요"));
		bookshelf.appendBook(new Book("유숨숨", "숭숭아니여요"));
		
		// iterator 불러내기
		Iterator it = bookshelf.iterator();
		
		// print 하기
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName() + ", " + book.getAuthor());
		}
		
	}
}
