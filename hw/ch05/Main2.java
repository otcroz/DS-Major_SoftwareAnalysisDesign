package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYooSooYeon2;

public class Main2 extends Thread {
	public static void main(String[] args) {
		System.out.println("20200818 ������");
		new Main2("�ֽ���").start(); //������: start()�� ȣ���ϸ� �ڵ����� run() ����
		new Main2("������").start();
		new Main2("�̼���").start();

	}

	public void run() {
		IDCardFactoryYooSooYeon2 obj = IDCardFactoryYooSooYeon2.getInstance();
		System.out.println(getName() + ": obj = " + obj);
	}
	
	public Main2(String name) {
		super(name);
	}
}
