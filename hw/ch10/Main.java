package hw.ch10;

public class Main {
    public static void main(String[] args) { // �������� ������ �ǵ��� ����
    	System.out.println("20200818 ������");
    	// ������: Student ������ �迭 ����
        Student data1[] = {new Student("������", "20200818", 159), new Student("������", "20201000", 154),
        		new Student("������", "20200709", 158), new Student("������", "20200675", 153), new Student("Ȳ����", "20200965", 162)};
        Student data2[] = {new Student("������", "20200818", 159), new Student("������", "20201000", 154),
        		new Student("������", "20200709", 158), new Student("������", "20200675", 153), new Student("Ȳ����", "20200965", 162)};
        
        // ���� ����
        System.out.println("<���� ���>");
       
        System.out.println("(1) by InsertSorter: ");  // 1. InsertSorter�� ���� ���
        SortAndPrint sap = new SortAndPrint(data1, new InsertSorter());
        sap.execute();
        
        System.out.println();
        System.out.println("(2) by BubbleSorter: ");  // 2. BubbleSorter�� ���� ���
        sap = new SortAndPrint(data2, new BubbleSorter());
        sap.execute();
    }
}
