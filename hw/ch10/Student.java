package hw.ch10;

public class Student implements Comparable<Student>{ // Comparable에 Type 설정

	String name;
	String id;
	int height;
	
	public Student(String name, String id, int height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	
	@Override
	public int compareTo(Student o) { //Student type으로 비교(문제수정)
		int res;
		//this.height, s.height (현재 객체의 키, 인자로 들어온 키를 비교)
		
		if (this.height > o.height) //if 현재가 더 크면 0보다 큰 숫자
			res = 1;
		else if (this.height < o.height) //if 인자로 들어온 객체가 더 크면 -1이하의 수 반환
			res = -1;
		else // 두 객체의 height 값이 같을 때
			res = 0;
		
		return res;
	}
	
	public String toString() {
		return "[이름: " + name + ", 학번: " + id + ", 키: " + height + "]";
	}
	
	public String getName() {
		return name;
	}
}
