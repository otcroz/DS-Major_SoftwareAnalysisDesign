package study.ch04.framework;

public abstract class Store {
	public final Product create(String productName) {
		Product p = createProduct(productName);
		packingProduct(p);
		return p;
	} // Template Method
	
	protected Product createProduct(String name) throws StoreException { // Product ����
		// ���������� ���� �� ���� ó��
		throw new StoreException();
	}
	
	protected abstract void packingProduct(Product product);

}
