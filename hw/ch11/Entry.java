package hw.ch11;

public abstract class Entry {
	public abstract String getName(); // �̸��� ��´�.

	public abstract int getSize(); // ����� ��´�.
	
	public abstract String getAuthor(); // ������: ���� �����ڸ� ��´�.
	
	public abstract int getCount(); // ������: ������ ��´�.
	
	public abstract String getDate(); // ������: ��¥�� ��´�.
	

	public Entry add(Entry entry) throws FileTreatmentException {
		// �� Ŭ������ �ٸ� ��Ʈ���� �߰��Ϸ��� �ϸ�, ���ܸ� �߻���Ų��.
		// "�ڽ��� ó������ �ʰ�, �� �޼ҵ带 ȣ���� ��ü�� ���Ľ�Ų��"��� ����Ǿ� ����.
		throw new FileTreatmentException();
	}

	//printList() �޼��� �������̵� 
	public void printList() { // �϶��� ǥ���Ѵ�.
		printList("");
	}

	protected abstract void printList(String prefix); // prefix�� �տ� �ٿ��� �϶���
														// ǥ���Ѵ�.

	public String toString() { // ���ڿ� ǥ��
		return getName() + " (" + getSize() + ")" + "[" + getDate() + "]" + "[" + getCount() + "��]" + "[" + getAuthor() + "]";
	}
}
