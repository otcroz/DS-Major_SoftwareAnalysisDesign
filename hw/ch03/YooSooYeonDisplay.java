package hw.ch03;

public class YooSooYeonDisplay extends AbstractDisplay {

	private String name;
	private String studentID;
	private int grade;
	
	public YooSooYeonDisplay(String name, String studentID, int grade){ // 객체를 생성할 때 이름, 학번, 학년을 받음
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
	}
	
	// AbstractDisplay의 함수 override
	@Override
	public void open() {
		System.out.println("====================");
		System.out.println("덕성여대 컴퓨터공학과");
		
	}

	@Override
	public void print() {
		System.out.println("학번 " + studentID + " / " + grade + "학년 / " + name);
	}

	@Override
	public void close() {
		System.out.println("템플릿 메소드 패턴 숙제입니다.");
		System.out.println("====================");

	}

}
