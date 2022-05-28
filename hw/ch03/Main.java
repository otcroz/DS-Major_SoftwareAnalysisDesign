package hw.ch03;

public class Main {
	public static void main(String[] args) {
		System.out.println("20200818 유수연");
		AbstractDisplay yoosooyeon = new YooSooYeonDisplay("유수연", "20200818", 3);
		yoosooyeon.display(10);
	}
}
