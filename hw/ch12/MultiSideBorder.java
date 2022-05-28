package hw.ch12;

public class MultiSideBorder extends Border {

	char ch; // 출력할 문자 
	int num; // 반복적으로 출력할 문자의 수
	
	protected MultiSideBorder(Display display, char ch, int num) {
		super(display);
		this.ch = ch;
		this.num = num;
	}

	@Override
	public int getColumns() { // Column의 값을 반환
		
		return num + display.getColumns() + num;
	}

	@Override
	public int getRows() {
		
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		StringBuffer s = new StringBuffer(); // StringBuffer 선언
		
		for(int i = 0; i<num; i++) { // num만큼 문자열을 버퍼에 저장
			s.append(ch);
		}
		// 버퍼에 들어있는 문자열 + 출력 문자열 + 버퍼에 들어있는 문자열
		return s.toString() + display.getRowText(row) + s.toString();
		
	}

}
