package ch01.pratice.iterator;

import java.util.Vector;

public class BookShelf implements Aggregate{

	private Vector<Book> bookshelf;
	
	public BookShelf(int num){
		bookshelf = new Vector<Book>(num);
	}
	

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	public Iterator iterator2() {
		return new BackBookShelfIterator(this);
	}
	
	public void appendBook(Book book) {
		bookshelf.add(book);
	}
	
	public Book getBook(int n) { // Object�� ������ ����: Vector.get() ��ȯ�� Ÿ���� Object
		return bookshelf.get(n); // �ش��ϴ� ��ü ��ȯ
	}
	
	public int getLength() {
		return bookshelf.size();
	}

}
