package hw.ch10;

public class InsertSorter implements Sorter {
	
	//������: ����ð� ����ؼ� �Ӽ��� ��Ƶ�
	long executeTime;
	
	public void sort(Comparable[] data) {
		long startTime = System.nanoTime(); // ������: �ڵ� ���� ���� �ð� ����
		
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				// data�� �����̸� �ε�ȣ�� �� ����
				// data�� ��ü�̸� �޼ҵ带 �̿��ؼ� ��
				//���ϴ� �޼ҵ� �̸�: compareTo() �⺻���� ����
				if (data[i].compareTo(data[j]) < 0) { // data[i] �� data[j] ���� ũ��
					// ���� ��ȯ�Ѵ�.
					Comparable passingplace = data[i];
					data[i] = data[j];
					data[j] = passingplace;
				}
			}
		}
		long endTime = System.nanoTime(); // ������: �ڵ� ���� �� �ð� ����
		executeTime = endTime - startTime;
	}
	
	//������: ���� �ð��� ���� �޼ҵ�
	public double getExecution(){
		return executeTime / 1000000.0;
	}
}
