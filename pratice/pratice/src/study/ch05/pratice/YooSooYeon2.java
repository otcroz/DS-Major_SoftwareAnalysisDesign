package study.ch05.pratice;

public class YooSooYeon2 {
	private static YooSooYeon2 yoosooyeon = null;
	
	private YooSooYeon2(){ 
		
	}
	
	public static YooSooYeon2 getInstance() {
		if(yoosooyeon == null) 
			yoosooyeon = new YooSooYeon2();
		return yoosooyeon;
	}
	
}
