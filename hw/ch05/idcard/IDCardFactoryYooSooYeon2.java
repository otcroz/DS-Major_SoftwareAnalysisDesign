package hw.ch05.idcard;

import java.util.Vector;


import hw.ch05.framework.Factory;
import hw.ch05.framework.Product;

public class IDCardFactoryYooSooYeon2 extends Factory {
	private static IDCardFactoryYooSooYeon2 IDCardFactory = null; // ������: ���������� ���� null�� �ʱ�ȭ�Ѵ�.
	private Vector owners = new Vector();

	// ������
	private IDCardFactoryYooSooYeon2() {
		slowdown();
	}

	// IDCardFactoryYooSooYeon2 ���� �ʵ尡 ����Ű�� IDCardFactoryYooSooYeon2 ��ü�� ��ȯ��
	synchronized public static IDCardFactoryYooSooYeon2 getInstance() {
		if(IDCardFactory == null)
			IDCardFactory = new IDCardFactoryYooSooYeon2();
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

	private void slowdown() {
		try {
			Thread.sleep(3000);  // �� �޼ҵ带 ȣ���� ������� 1000 �и���, �� 1�ʰ� CPU�� ������ ����.    
		} catch (InterruptedException e) {
		}
	}
    

}
