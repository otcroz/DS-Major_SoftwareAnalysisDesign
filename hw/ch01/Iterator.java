package hw.ch01;

// ��� Iterator�� ������ �� �޼ҵ带 ������ �������̽�
public interface Iterator {
	// ���Ұ� �� �ִ��� �˻��� �� ���Ǵ� �޼ҵ�
    public abstract boolean hasNext(); 
    public abstract Object next(); // �� ���� ���Ҹ� �� �� ���Ǵ� �޼ҵ� 
}