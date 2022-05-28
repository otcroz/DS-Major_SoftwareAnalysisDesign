package hw.ch03;

public class YooSooYeonDisplay extends AbstractDisplay {

	private String name;
	private String studentID;
	private int grade;
	
	public YooSooYeonDisplay(String name, String studentID, int grade){ // ��ü�� ������ �� �̸�, �й�, �г��� ����
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
	}
	
	// AbstractDisplay�� �Լ� override
	@Override
	public void open() {
		System.out.println("====================");
		System.out.println("�������� ��ǻ�Ͱ��а�");
		
	}

	@Override
	public void print() {
		System.out.println("�й� " + studentID + " / " + grade + "�г� / " + name);
	}

	@Override
	public void close() {
		System.out.println("���ø� �޼ҵ� ���� �����Դϴ�.");
		System.out.println("====================");

	}

}
