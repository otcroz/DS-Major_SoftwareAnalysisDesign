package hw.ch01;

public class Main {
	// ��� �ڹ� ���α׷��� main() �޼ҵ���� ���۵ȴ�.
    public static void main(String[] args) {
    	System.out.println("20200818 ������");
    	// ������: �ִ� 6���� å�� ���� �� �ִ� å���̸� �����Ѵ�.
        BookShelf bookShelf = new BookShelf(6);
        // Aggregate bookShelf2 = new BookShelf(5);
        // ������: 6���� å�� �ȴ´�.
        bookShelf.appendBook(new Book("�ڷᱸ����", "�ڿ�â"));
        bookShelf.appendBook(new Book("����Ʈ����м�����", "�ֽ���"));
        bookShelf.appendBook(new Book("���α׷��Ӽ���", "���ֿ�"));
        bookShelf.appendBook(new Book("��ǻ���ǵ��ۿ���", "���߾�"));
        bookShelf.appendBook(new Book("��ǻ�ͱ׷��Ƚ�", "�̰��"));
        bookShelf.appendBook(new Book("�Ƹ��", "������"));

		// å������ Iterator�� ���´�.
        // ���� �����Ǵ� ��ü�� Ÿ���� BookShelfIterater�̴�.
		Iterator it = bookShelf.iterator();
        
		// å�� ����ؼ� ������ while ������ ����.
		// å�� �� �ִ��� �˻��ϱ� ���ؼ�, iterator�� hasNext()�� ȣ���Ѵ�.
		while (it.hasNext()) {
			Book book = (Book)it.next(); // ���� å�� ���´�. // Ÿ�� ĳ���� or ����ȯ
			// �� ���� ��ſ�
			// Object book = it.next();
			// �� ����ϸ� �� �ȴ�.
            // �ֳ��ϸ�, �Ʒ����� book.getName()�� ȣ���ϴµ�,
			// Object Ÿ���� getName() �� �������� �ʴ´�.
			// ����,  it.next( )�� ��ȯ�� Object ���� Book ������ "��������ȯ"�ؾ� �Ѵ�.

			// å�� �̸��� ����Ѵ�.
			System.out.println("" + book.getName() + ", " + book.getAuthor());
           
        }
    }
}





