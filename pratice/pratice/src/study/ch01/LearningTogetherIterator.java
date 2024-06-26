package study.ch01;

public class LearningTogetherIterator implements Iterator {
	private LearningTogether learningTogether;
	int index;

	public LearningTogetherIterator(LearningTogether learningTogether) {
		this.learningTogether = learningTogether;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < learningTogether.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Student s = learningTogether.getStudentFrom(index);
		index++;
		return s;
	}

}
