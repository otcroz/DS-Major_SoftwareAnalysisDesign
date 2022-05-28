package hw.ch05.framework;

import ch04.Sample.framework.FacatoryMethodRuntimeException;


public abstract class Factory {
	// ���� �����, ����ϴ� ���� �ϴ� �޼ҵ� (���ø��޼ҵ��̴�)
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

	// ���� Ŭ����(��ü���� ����)���� �����ϴ� �޼ҵ��
    //protected abstract Product createProduct(String owner);
    protected Product createProduct(String owner) throws FacatoryMethodRuntimeException { // ����Ʈ ����
    	throw new FacatoryMethodRuntimeException(); // createProduct�� ȣ���ϸ� ���� ��ü�� �߻���Ų��.
    	// createProduct�� ������ ���� ������ ���ܸ� ȣ���ϵ��� ��.
    }

    
    protected abstract void registerProduct(Product product);
}

