package study.ch05.pratice;

public class YooSooYeon1 {
	private static YooSooYeon1 yoosooyeon = new YooSooYeon1();
	
	private YooSooYeon1(){ 
		
	}
	
	public static YooSooYeon1 getInstance() {
		return yoosooyeon;
	}
	
}
