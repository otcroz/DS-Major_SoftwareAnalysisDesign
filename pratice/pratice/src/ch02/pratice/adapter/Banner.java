package ch02.pratice.adapter;

public class Banner {
	
	String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	public void showWithParan() {
		System.out.println( string + "����� �����մϴ�.");
	}
	
	public void showWithAster() {
		System.out.println( string + "����� �����ϴ�.");
	}
}
