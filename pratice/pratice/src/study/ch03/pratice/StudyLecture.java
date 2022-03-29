package study.ch03.pratice;

public abstract class StudyLecture {
	abstract void watchingLecture();
	
	abstract void reviewOfStudy();
	
	abstract void assignments();
	
	final void display() { // final 선언: 하위 클래스가 수정할 수 없도록
		watchingLecture();
		
		for (int i=0; i<3;i++) reviewOfStudy();
		
		assignments();
	}
}
