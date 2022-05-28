package hw.ch05.idcard;

import java.util.Vector;

import ch05.Sample.Singleton;
import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYooSooYeon1 extends Factory{

	private static IDCardFactoryYooSooYeon1 IDCardFactory = new IDCardFactoryYooSooYeon1(); // 객체 생성
	private Vector owners = new Vector();

	// 생성자
	private IDCardFactoryYooSooYeon1() {

	}

	// 유수연: IDCardFactoryYooSooYeon1 정적 필드가 가리키는 IDCardFactoryYooSooYeon1 객체를 반환한다.
	public static IDCardFactoryYooSooYeon1 getInstance() {

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


}
