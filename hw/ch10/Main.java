package hw.ch10;

public class Main {
    public static void main(String[] args) { // 내림차순 정렬이 되도록 구현
    	System.out.println("20200818 유수연");
    	// 유수연: Student 데이터 배열 생성
        Student data1[] = {new Student("유수연", "20200818", 159), new Student("유영주", "20201000", 154),
        		new Student("김은서", "20200709", 158), new Student("문서연", "20200675", 153), new Student("황성민", "20200965", 162)};
        Student data2[] = {new Student("유수연", "20200818", 159), new Student("유영주", "20201000", 154),
        		new Student("김은서", "20200709", 158), new Student("문서연", "20200675", 153), new Student("황성민", "20200965", 162)};
        
        // 정렬 실행
        System.out.println("<정렬 결과>");
       
        System.out.println("(1) by InsertSorter: ");  // 1. InsertSorter에 대한 출력
        SortAndPrint sap = new SortAndPrint(data1, new InsertSorter());
        sap.execute();
        
        System.out.println();
        System.out.println("(2) by BubbleSorter: ");  // 2. BubbleSorter에 대한 출력
        sap = new SortAndPrint(data2, new BubbleSorter());
        sap.execute();
    }
}
