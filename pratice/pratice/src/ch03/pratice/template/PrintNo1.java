package ch03.pratice.template;

public class PrintNo1 extends AbstractDisplay {

	public PrintNo1() {
		
	}

	@Override
	protected void start() {
		System.out.println("시작!");
		
	}

	@Override
	protected void content() {
		System.out.println("진행중~");
		
	}

	@Override
	protected void end() {
		System.out.println("끝!");
		
	}
	

}
