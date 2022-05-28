package hw.ch12;

public class MultiSideBorder extends Border {

	char ch; // ����� ���� 
	int num; // �ݺ������� ����� ������ ��
	
	protected MultiSideBorder(Display display, char ch, int num) {
		super(display);
		this.ch = ch;
		this.num = num;
	}

	@Override
	public int getColumns() { // Column�� ���� ��ȯ
		
		return num + display.getColumns() + num;
	}

	@Override
	public int getRows() {
		
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		StringBuffer s = new StringBuffer(); // StringBuffer ����
		
		for(int i = 0; i<num; i++) { // num��ŭ ���ڿ��� ���ۿ� ����
			s.append(ch);
		}
		// ���ۿ� ����ִ� ���ڿ� + ��� ���ڿ� + ���ۿ� ����ִ� ���ڿ�
		return s.toString() + display.getRowText(row) + s.toString();
		
	}

}
