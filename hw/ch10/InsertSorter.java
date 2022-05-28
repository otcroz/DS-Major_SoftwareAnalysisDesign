package hw.ch10;

public class InsertSorter implements Sorter {
	
	//유수연: 실행시간 계산해서 속성에 담아둠
	long executeTime;
	
	public void sort(Comparable[] data) {
		long startTime = System.nanoTime(); // 유수연: 코드 실행 시작 시간 삽입
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				// data가 숫자이면 부등호로 비교 가능
				// data가 객체이면 메소드를 이용해서 비교
				//비교하는 메소드 이름: compareTo() 기본으로 제공
				if (data[i].compareTo(data[j]) < 0) { // data[i] 가 data[j] 보다 크면
					// 서로 교환한다.
					Comparable passingplace = data[i];
					data[i] = data[j];
					data[j] = passingplace;
				}
			}
		}
		long endTime = System.nanoTime(); // 유수연: 코드 실행 끝 시각 삽입
		executeTime = endTime - startTime;
	}
	
	//유수연: 실행 시간을 얻어가는 메소드
	public double getExecution(){
		return executeTime / 1000000.0;
	}
}
