package hw.ch10;

public class BubbleSorter implements Sorter {
	
	//유수연: 실행시간 계산해서 속성에 담아둠
	long executeTime;
	
	@Override
	public void sort(Comparable[] data) {
		long startTime = System.nanoTime(); // 유수연: 코드 실행 시작 시간 삽입
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// Student type의 data[i]에서 height 값을 비교하기
				if (data[i].compareTo(data[j]) > 0) {
					// 유수연: 조건이 성립하면 data[i]와 data[i+1]을 바꿔준다.
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
		return executeTime / 100000.0;
	}

}
