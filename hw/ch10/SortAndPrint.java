package hw.ch10;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter; //������: sort�� ����
    }
    public void execute() { //������: sort�� print �����ϴ� �޼���
        print();
        sorter.sort(data); //������: sorter sort ȣ��, ������ ����
        print();
        System.out.println("* execution time:" + sorter.getExecution() + "(miliseconds)");
    }
    public void print() { //������: data ���
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("");
    }
}
