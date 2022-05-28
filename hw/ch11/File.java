package hw.ch11;

public class File extends Entry {
	private String name;
	private int size;
	private String date;
	private String author;
	

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	// ������: ���ϸ�, ��������, ũ��, ������ ����� �̸��� ���ڷ� �޴� ������
	public File(String name, String date, int size, String author) {
		this.name = name;
		this.size = size;
		this.date = date;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	public int getCount() {
		return 1;
	}

	protected void printList(String prefix) { // �������̵�
		System.out.println(prefix + "/" + this); //this.toString()
	}

	public String getAuthor() {
		return author;
	}
	
	public String getDate() {
		return date;
	}
}
