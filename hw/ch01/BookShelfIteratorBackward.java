package hw.ch01;

public class BookShelfIteratorBackward implements Iterator {
	// �� Iterator�� ���ƴٴ� å���̸� ����Ű�� �Ӽ�
	private BookShelf bookShelf;
	// ���� å ��ȣ�� �����ϴ� �Ӽ�
	private int index;

	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = bookShelf.getLength() - 1; // ������: å���̸� ���ƴٴϱ� ���̹Ƿ�, ������ ��ġ�� �ʱ�ȭ�Ѵ�.
	}

	@Override
	public boolean hasNext() { 
		// ������: ���� å ��ȣ�� 0���� ������,
	    // å���̿� ���ƴٴ� å�� ���̻� �����Ƿ� false�� ��ȯ�Ѵ�.
        if (index < 0) {
            return false;
        } else {
            return true;
        }
	}

	@Override
	public Object next() { 
        // �� Iterator�� ����Ű�� å������ getBookAt(index)�� �̿��ؼ�
		// index å��ȣ�� �ش��ϴ� å�� ���ͼ� book�� �����Ѵ�.
		Book book = bookShelf.getBookFrom(index);
        // ������: ���� å��ȣ�� 1 ���ҽ�Ų��.
		index--;
		// ���� å�� ��ȯ�Ѵ�.
        return book;
	}

}
