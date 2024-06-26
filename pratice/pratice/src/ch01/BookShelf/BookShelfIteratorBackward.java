package ch01.BookShelf;

public class BookShelfIteratorBackward implements Iterator {
	BookShelf bookshelf;
	int index;

	BookShelfIteratorBackward(BookShelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = bookshelf.getLength() - 1;
	}

	@Override
	public boolean hasNext() {
		if (index >= 0)
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Book book = bookshelf.getBookFrom(index);
		index--;

		return book;
	}

}
