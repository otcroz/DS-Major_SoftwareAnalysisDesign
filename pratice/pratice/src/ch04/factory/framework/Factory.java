package ch04.factory.framework;

abstract public class Factory {
	final public void  create(String name){ // Template Method ����
		Product p = createProduct(name);
		registerProduct(p);
	}
	
	protected abstract Product createProduct(String string);
		// throws // ���� Ŭ����
		// throw new // ����


	protected abstract void registerProduct(Product p);

	
	
}
