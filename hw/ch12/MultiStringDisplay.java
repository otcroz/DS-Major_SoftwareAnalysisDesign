package hw.ch12;

import java.util.Vector;

public class MultiStringDisplay extends Display {
	private Vector body = new Vector(); // 표시 문자열, 문자열을 보관(여러 줄)

	private int columns = 0; // 최대 문자수

	public void add(String msg) { // 문자열 추가
		body.add(msg); // 벡터에 문자열을 추가
		updateColumn(msg); 
	}

	public int getColumns() { // 문자수
		return columns;
	}

	public int getRows() { // 줄 수
		return body.size(); // body에 저장된 문자열 수 = 줄 수 
	}

	public String getRowText(int row) { // 줄의 내용
		//Object를 String으로 형변환
		return (String) body.get(row); // 벡터에서 문자열을 꺼내옴, get()의 type: Object
	}

	// 더 긴 문자열이 추가되면, 나머지 문자열들은 각각 알맞은 갯수의 빈 칸을 추가한다.
	private void updateColumn(String msg) { // 문자수를 갱신한다. msg: 추가된 메시지
		if (msg.getBytes().length > columns) { // 한글을 위해 getBytes() 사용, 현재보다 더 긴 문자열이 들어오면
			columns = msg.getBytes().length; // 더 긴 문자열의 길이로 업데이트
		}
		// 더 짧은 문자열으 빈칸을 추가
		for (int row = 0; row < body.size(); row++) {
			int fills = columns - ((String) body.get(row)).getBytes().length; // column - 현재 문자열의 길이
			if (fills > 0) {
				body.set(row, body.get(row) + spaces(fills)); // row 위치를, 갱신된 문자열로 대치한다. 현재 문자열 + 빈칸(문자열 연결)
			} // set() row 번째의 문자열을 대체한다.(교체)
		}
	}

	// count 만큼의 공백 문자열을 만든다.
	private String spaces(int count) { 
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(' '); // 빈칸을 추가
		}
		return buf.toString();
	}
}
