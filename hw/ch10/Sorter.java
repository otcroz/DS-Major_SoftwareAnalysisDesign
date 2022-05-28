package hw.ch10;

import java.lang.Comparable;
import java.util.Comparator;

public interface Sorter {
    public abstract void sort(Comparable[] data);
    public abstract double getExecution(); // 유수연: 코드 실행 시간을 반환하는 메서드
}
