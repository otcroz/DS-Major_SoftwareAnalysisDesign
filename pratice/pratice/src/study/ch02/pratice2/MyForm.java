package study.ch02.pratice2;

public class MyForm implements PrintMyInfo  {

	PrintInfoForm myform; // 참조 변수 생성
	
	public MyForm(String university, String studentID, String name) {
		this.myform = new PrintInfoForm(university, studentID, name);
	}
	
	@Override
	public void printModeA() {
		myform.squareBrackets();

	}

	@Override
	public void printModeB() {
		myform.brace();

	}

	@Override
	public void printModeC() {
		myform.parentheses();

	}

}
