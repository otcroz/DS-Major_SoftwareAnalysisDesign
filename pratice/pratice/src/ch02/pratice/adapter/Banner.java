package ch02.pratice.adapter;

public class Banner {
	
	String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParan() {
		System.out.println( string + "출력을 시작합니다.");
	}
	
	public void showWithAster() {
		System.out.println( string + "출력을 끝냅니다.");
	}
}
