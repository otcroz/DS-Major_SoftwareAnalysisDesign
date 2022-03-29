package ch02.adapter.sample1;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string); //Banner Å¬·¡½º
	}
	
	@Override
	public void printWeak() {
		showWithParan();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
	
	
}
