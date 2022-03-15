package study.ch01;

public class LearningTogether implements Aggregate {
	Student students[];
	int last;
	
	public LearningTogether(int maxsize) {
		students = new Student[maxsize];
		last = 0;
	}
	
	public Student getStudentFrom(int index) {
		return students[index];
	}
	
	public void appendStudent(Student s) {
		students[last] = s;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator iterator() {
		return new LearningTogetherIterator(this);
	}
}
