package ch05.pratice.singleton;

public class Main2 extends Thread {
	public static void main(String[] args) {
		new Main2("������1").start();
		new Main2("������2").start(); // start()�� ȣ���ϸ� run�� �ڵ� ȣ��
		new Main2("������3").start();
		

	}
	
	public void run() {
		Singleton2 singleton = Singleton2.getInstance();
		System.out.println( singleton + "�Դϴ�.");
	}
	
	public Main2(String name){ 
		super(name);
	}
}