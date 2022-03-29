package ch02.adapter.sample2;

public class PrintBanner implements Print{

	Banner banner;
	
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	
	@Override
	public void printWeak() {
		banner.showWithParan();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
	
}
