package ch02.adapter.sample2;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("À¯¼ö¿¬");
		p.printWeak();
		p.printStrong();
	}
}
