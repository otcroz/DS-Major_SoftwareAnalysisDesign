package hw.ch12;

import java.util.Vector;

public class MultiStringDisplay extends Display {
	private Vector body = new Vector(); // ǥ�� ���ڿ�, ���ڿ��� ����(���� ��)

	private int columns = 0; // �ִ� ���ڼ�

	public void add(String msg) { // ���ڿ� �߰�
		body.add(msg); // ���Ϳ� ���ڿ��� �߰�
		updateColumn(msg); 
	}

	public int getColumns() { // ���ڼ�
		return columns;
	}

	public int getRows() { // �� ��
		return body.size(); // body�� ����� ���ڿ� �� = �� �� 
	}

	public String getRowText(int row) { // ���� ����
		//Object�� String���� ����ȯ
		return (String) body.get(row); // ���Ϳ��� ���ڿ��� ������, get()�� type: Object
	}

	// �� �� ���ڿ��� �߰��Ǹ�, ������ ���ڿ����� ���� �˸��� ������ �� ĭ�� �߰��Ѵ�.
	private void updateColumn(String msg) { // ���ڼ��� �����Ѵ�. msg: �߰��� �޽���
		if (msg.getBytes().length > columns) { // �ѱ��� ���� getBytes() ���, ���纸�� �� �� ���ڿ��� ������
			columns = msg.getBytes().length; // �� �� ���ڿ��� ���̷� ������Ʈ
		}
		// �� ª�� ���ڿ��� ��ĭ�� �߰�
		for (int row = 0; row < body.size(); row++) {
			int fills = columns - ((String) body.get(row)).getBytes().length; // column - ���� ���ڿ��� ����
			if (fills > 0) {
				body.set(row, body.get(row) + spaces(fills)); // row ��ġ��, ���ŵ� ���ڿ��� ��ġ�Ѵ�. ���� ���ڿ� + ��ĭ(���ڿ� ����)
			} // set() row ��°�� ���ڿ��� ��ü�Ѵ�.(��ü)
		}
	}

	// count ��ŭ�� ���� ���ڿ��� �����.
	private String spaces(int count) { 
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(' '); // ��ĭ�� �߰�
		}
		return buf.toString();
	}
}
