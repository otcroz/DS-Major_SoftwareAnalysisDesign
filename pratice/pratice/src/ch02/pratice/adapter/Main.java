package ch02.pratice.adapter;

public class Main {
	public static void main(String[] args) {
		Print p1 = new PrintBanner("������");
		p1.printWeak();
		p1.printStrong();
		
		Print p2 = new PrintBanner("��������");
		p2.printWeak();
		p2.printStrong();
	}
}
