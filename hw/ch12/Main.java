package hw.ch12;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200818 ������"); 
		MultiStringDisplay multi = new MultiStringDisplay();
		multi.add("�й�: 20200818");
		multi.add("�̸�: ������");
		multi.add("�ڵ��� ��ȣ: 010-357*-****");
		
		Display ysy = new MultiSideBorder( new UpDownBorder(new FullBorder(new SideBorder(multi, '%')), '='), '*', 3);
		ysy.show(); 

	}

}
