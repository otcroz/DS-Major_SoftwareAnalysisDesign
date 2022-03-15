package ch01.BookShelf;

public class BookShelfIterator implements Iterator {
	private BookShelf bookshelf; // iterator로 따라가야 할 
	private int index; // 인덱스
	
	public BookShelfIterator(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < bookshelf.getLength()) return true;
		else return false;
	}

	@Override
	public Object next() {
		Book book = bookshelf.getBookFrom(index);
		index++;
		
		return book;
	}

}
