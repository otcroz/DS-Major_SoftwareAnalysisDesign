package ch03.template.sample;

public class PrintNo1 extends AbstractDisplay {

	private String string;
	
	public PrintNo1(String string) {
		this.string = string;
	}
	
	@Override
	public void start() {
		System.out.println("Start!");
	}

	@Override
	public void content() {
		System.out.println(string);
	}

	@Override
	public void end() {
		System.out.println("End!");
	}

}
