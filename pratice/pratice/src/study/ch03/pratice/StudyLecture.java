package study.ch03.pratice;

public abstract class StudyLecture {
	abstract void watchingLecture();
	
	abstract void reviewOfStudy();
	
	abstract void assignments();
	
	final void display() { // final ����: ���� Ŭ������ ������ �� ������
		watchingLecture();
		
		for (int i=0; i<3;i++) reviewOfStudy();
		
		assignments();
	}
}
