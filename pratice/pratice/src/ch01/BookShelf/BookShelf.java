package ch01.BookShelf;

import java.util.Vector;

public class BookShelf {
	//private Book[] books;
	private Vector<Book> books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		//books = new Book[maxsize];
		books = new Vector<Book>(maxsize);
	}
	
	public void appendBook(Book book){
		///books[last] = book;
		//last++;
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
		//return last;
	}
	
	public Book getBookFrom(int index) {
		return books.get(index);
		//return books[index];
	}
	
	public Iterator iterator() { // 기억하기!
		//return new BookShelfIterator(this); // 자신의 객체에 대한 iterator을 반환
		return new BookShelfIteratorBackward(this);
	}
}
