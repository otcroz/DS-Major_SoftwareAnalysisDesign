package hw.ch01;

// å���̿� ���� å�� ��Ÿ���� Ŭ����
public class Book {
    private String name = ""; // å�� �̸��� �����Ѵ�.
    private String author = ""; // ������: å�� ���ڸ� �����Ѵ�.

	// ���ڿ��� �Է� ���ڷ� �޾Ƽ� �ڽ��� �Ӽ��� name�� �����Ѵ�.
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

	// �ڽ��� �̸��� ��ȯ�ϴ� �޼ҵ�
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
    	return author;
    }
}


// Book b1 = new Book("�ڹ�");