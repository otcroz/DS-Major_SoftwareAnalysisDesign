package hw.ch10;

public class BubbleSorter implements Sorter {
	
	//������: ����ð� ����ؼ� �Ӽ��� ��Ƶ�
	long executeTime;
	
	@Override
	public void sort(Comparable[] data) {
		long startTime = System.nanoTime(); // ������: �ڵ� ���� ���� �ð� ����
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// Student type�� data[i]���� height ���� ���ϱ�
				if (data[i].compareTo(data[j]) > 0) {
					// ������: ������ �����ϸ� data[i]�� data[i+1]�� �ٲ��ش�.
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
		return executeTime / 100000.0;
	}

}
