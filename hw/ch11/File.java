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
	
	// 유수연: 파일명, 생성일자, 크기, 생성한 사람의 이름을 인자로 받는 생성자
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

	protected void printList(String prefix) { // 오버라이딩
		System.out.println(prefix + "/" + this); //this.toString()
	}

	public String getAuthor() {
		return author;
	}
	
	public String getDate() {
		return date;
	}
}
