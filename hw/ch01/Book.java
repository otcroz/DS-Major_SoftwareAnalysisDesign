package hw.ch01;

// 책꽂이에 꽂힐 책을 나타내는 클래스
public class Book {
    private String name = ""; // 책의 이름을 저장한다.
    private String author = ""; // 유수연: 책의 저자를 저장한다.

	// 문자열을 입력 인자로 받아서 자신의 속성인 name에 저장한다.
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

	// 자신의 이름을 반환하는 메소드
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
    	return author;
    }
}


// Book b1 = new Book("자바");