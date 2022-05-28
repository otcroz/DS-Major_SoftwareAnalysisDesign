package hw.ch10;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter; //유수연: sort를 설정
    }
    public void execute() { //유수연: sort와 print 진행하는 메서드
        print();
        sorter.sort(data); //유수연: sorter sort 호출, 데이터 정렬
        print();
        System.out.println("* execution time:" + sorter.getExecution() + "(miliseconds)");
    }
    public void print() { //유수연: data 출력
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("");
    }
}
