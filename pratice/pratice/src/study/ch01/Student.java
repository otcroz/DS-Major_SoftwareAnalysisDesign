package study.ch01;

public class Student {
	String name;
	String studentId;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return studentId;
	}
}
