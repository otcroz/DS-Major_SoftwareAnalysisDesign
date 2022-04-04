package ch02.pratice.adapter;

public class PrintBanner1 implements Print {

	Banner banner;
	String string;
	
	public PrintBanner1(String string) {
		banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithAster();
		
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
