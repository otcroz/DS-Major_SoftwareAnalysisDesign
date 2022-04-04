package ch05.pratice.singleton;

public class Singleton2 {
	private static Singleton2 singleton2 = null;
	
	private Singleton2() {}
	
	synchronized public static Singleton2 getInstance() {
		if(singleton2 == null)
			singleton2 = new Singleton2();
		
		return singleton2;
	}
	
}
