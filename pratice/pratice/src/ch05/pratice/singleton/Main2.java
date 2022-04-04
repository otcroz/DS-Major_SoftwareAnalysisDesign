package ch05.pratice.singleton;

public class Main2 extends Thread {
	public static void main(String[] args) {
		new Main2("유수연1").start();
		new Main2("유수연2").start(); // start()를 호출하면 run이 자동 호출
		new Main2("유수연3").start();
		

	}
	
	public void run() {
		Singleton2 singleton = Singleton2.getInstance();
		System.out.println( singleton + "입니다.");
	}
	
	public Main2(String name){ 
		super(name);
	}
}
