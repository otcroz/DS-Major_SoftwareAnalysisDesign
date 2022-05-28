package hw.ch10;

public class Student implements Comparable<Student>{ // Comparable�� Type ����

	String name;
	String id;
	int height;
	
	public Student(String name, String id, int height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	
	@Override
	public int compareTo(Student o) { //Student type���� ��(��������)
		int res;
		//this.height, s.height (���� ��ü�� Ű, ���ڷ� ���� Ű�� ��)
		
		if (this.height > o.height) //if ���簡 �� ũ�� 0���� ū ����
			res = 1;
		else if (this.height < o.height) //if ���ڷ� ���� ��ü�� �� ũ�� -1������ �� ��ȯ
			res = -1;
		else // �� ��ü�� height ���� ���� ��
			res = 0;
		
		return res;
	}
	
	public String toString() {
		return "[�̸�: " + name + ", �й�: " + id + ", Ű: " + height + "]";
	}
	
	public String getName() {
		return name;
	}
}
