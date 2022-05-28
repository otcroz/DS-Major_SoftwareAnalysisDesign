package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYooSooYeon2;

public class Main2 extends Thread {
	public static void main(String[] args) {
		System.out.println("20200818 유수연");
		new Main2("최승훈").start(); //유수연: start()를 호출하면 자동으로 run() 실행
		new Main2("유수연").start();
		new Main2("이서현").start();

	}

	public void run() {
		IDCardFactoryYooSooYeon2 obj = IDCardFactoryYooSooYeon2.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}
	
	public Main2(String name) {
		super(name);
	}
}
