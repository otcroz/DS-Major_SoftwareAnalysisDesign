package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYooSooYeon1;
import hw.ch05.idcard.IDCardFactoryYooSooYeon2;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("20200818 ������");
		IDCardFactoryYooSooYeon1 factory1 = IDCardFactoryYooSooYeon1.getInstance();
		IDCardFactoryYooSooYeon1 factory2 = IDCardFactoryYooSooYeon1.getInstance();
		
		if(factory1 == factory2) System.out.println("factory1�� factory2�� ���� �ν��Ͻ� �Դϴ�.");
		else System.out.println("factory1�� factory2�� �ٸ� �ν��Ͻ� �Դϴ�.");
	}
}
