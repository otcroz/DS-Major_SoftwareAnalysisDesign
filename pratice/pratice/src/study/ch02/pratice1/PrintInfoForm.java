package study.ch02.pratice1;

public class PrintInfoForm { // �츮�� ����� Ŭ����
	private String university;
	private String studentID;
	private String name;
	
	public PrintInfoForm(String university, String studentID, String name) {
		this.university = university;
		this.studentID = studentID;
		this.name = name;
	}
	
	public void squareBrackets() {
		System.out.println(" [" + university + ", " + studentID + ", " + name  + "]");
	}
	
	public void brace() {
		System.out.println(" {" + university + ", " + studentID + ", " + name  + "}");
	}
	
	public void parentheses() {
		System.out.println(" (" + university + ", " + studentID + ", " + name  + ")");
	}
}
