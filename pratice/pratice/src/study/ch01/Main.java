package study.ch01;

public class Main {
	public static void main(String[] args) {
    	// 최대 4명의 학생을 담을 수 있는 러닝투게더 출석부 생성
        LearningTogether learningTogether = new LearningTogether(4);
       
        // 4명의 학생 출석부에 입력
        learningTogether.appendStudent(new Student("문서연", "20201111"));
        learningTogether.appendStudent(new Student("유수연", "20201112"));
        learningTogether.appendStudent(new Student("이수민", "20201113"));
        learningTogether.appendStudent(new Student("조남윤", "20201114"));

		// 출석부의 Iterator를 얻어온다.
        // 실제 생성되는 객체의 타입은 LearningTogetherIterator
        Iterator it = learningTogether.iterator();


        
	// 학생이이 계속해서 있으면 while 루프를 돈다.
	// 학생이 더 있는지 검사하기 위해서, iterator의 hasNext()를 호출한다.
	while (it.hasNext()) {
		Student student = (Student)it.next(); // 다음 학생을 얻어온다.

		// 학생의 이름을 출력한다.
		System.out.print("" + student.getName());
		System.out.println(" " + student.getStudentId());
		System.out.println("--------------------");
			
        }
	}
}
