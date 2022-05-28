package hw.ch12;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200818 유수연"); 
		MultiStringDisplay multi = new MultiStringDisplay();
		multi.add("학번: 20200818");
		multi.add("이름: 유수연");
		multi.add("핸드폰 번호: 010-357*-****");
		
		Display ysy = new MultiSideBorder( new UpDownBorder(new FullBorder(new SideBorder(multi, '%')), '='), '*', 3);
		ysy.show(); 

	}

}
