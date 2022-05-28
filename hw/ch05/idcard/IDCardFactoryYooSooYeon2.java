package hw.ch05.idcard;

import java.util.Vector;


import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYooSooYeon2 extends Factory {
	private static IDCardFactoryYooSooYeon2 IDCardFactory = null; // 유수연: 참조변수의 값을 null로 초기화한다.
	private Vector owners = new Vector();

	// 생성자
	private IDCardFactoryYooSooYeon2() {
		slowdown();
	}

	// IDCardFactoryYooSooYeon2 정적 필드가 가리키는 IDCardFactoryYooSooYeon2 객체를 반환함
	synchronized public static IDCardFactoryYooSooYeon2 getInstance() {
		if(IDCardFactory == null)
			IDCardFactory = new IDCardFactoryYooSooYeon2();
		return IDCardFactory;
	}
	
    
	// 이 공장의 제품인 IDCard를 생산한다.
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

	// 생산된 제품의 owner를 등록(추가)한다.
    protected void registerProduct(Product product) {
        // product 를 IDCard로 형변환해야, getOwner()를 호출할 수 있다.
		owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }

	private void slowdown() {
		try {
			Thread.sleep(3000);  // 이 메소드를 호출한 스레드는 1000 밀리초, 즉 1초가 CPU를 내놓고 쉰다.    
		} catch (InterruptedException e) {
		}
	}
    

}
