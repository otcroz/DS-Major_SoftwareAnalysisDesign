package ch02.adapter.sample1;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("������");
		p.printWeak();
		p.printStrong();
	}
}
