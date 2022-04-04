package ch02.pratice.adapter;

public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
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
