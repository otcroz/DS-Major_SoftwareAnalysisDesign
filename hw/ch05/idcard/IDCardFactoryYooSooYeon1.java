package hw.ch05.idcard;

import java.util.Vector;

import ch05.Sample.Singleton;
import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYooSooYeon1 extends Factory{

	private static IDCardFactoryYooSooYeon1 IDCardFactory = new IDCardFactoryYooSooYeon1(); // ��ü ����
	private Vector owners = new Vector();

	// ������
	private IDCardFactoryYooSooYeon1() {

	}

	// ������: IDCardFactoryYooSooYeon1 ���� �ʵ尡 ����Ű�� IDCardFactoryYooSooYeon1 ��ü�� ��ȯ�Ѵ�.
	public static IDCardFactoryYooSooYeon1 getInstance() {

		return IDCardFactory;
	}
	
    
	// �� ������ ��ǰ�� IDCard�� �����Ѵ�.
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

	// ����� ��ǰ�� owner�� ���(�߰�)�Ѵ�.
    protected void registerProduct(Product product) {
        // product �� IDCard�� ����ȯ�ؾ�, getOwner()�� ȣ���� �� �ִ�.
		owners.add(((IDCard)product).getOwner());
    }
    
    public Vector getOwners() {
        return owners;
    }


}
