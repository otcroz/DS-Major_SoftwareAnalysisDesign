package ch01.pratice.iterator;

public class BackBookShelfIterator implements Iterator {

	private BookShelf bookshelf;
	private int index;
	
	public BackBookShelfIterator(BookShelf bookshelf){
		this.bookshelf = bookshelf;
		index = bookshelf.getLength() -1;
	}
	
	@Override
	public boolean hasNext() { // 0일 때
		if (index < 0) return false;
		else return true;
	}

	@Override
	public Object next() { // back으로 출력하도록
		return bookshelf.getBook(index--);
	}

}
