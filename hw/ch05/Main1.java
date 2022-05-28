package hw.ch05;

import hw.ch05.idcard.IDCardFactoryYooSooYeon1;
import hw.ch05.idcard.IDCardFactoryYooSooYeon2;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("20200818 유수연");
		IDCardFactoryYooSooYeon1 factory1 = IDCardFactoryYooSooYeon1.getInstance();
		IDCardFactoryYooSooYeon1 factory2 = IDCardFactoryYooSooYeon1.getInstance();
		
		if(factory1 == factory2) System.out.println("factory1과 factory2는 같은 인스턴스 입니다.");
		else System.out.println("factory1과 factory2는 다른 인스턴스 입니다.");
	}
}
