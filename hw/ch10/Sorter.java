package hw.ch10;

import java.lang.Comparable;
import java.util.Comparator;

public interface Sorter {
    public abstract void sort(Comparable[] data);
    public abstract double getExecution(); // ������: �ڵ� ���� �ð��� ��ȯ�ϴ� �޼���
}
