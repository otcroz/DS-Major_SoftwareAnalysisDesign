package study.ch04.framework;

public abstract class Store {
	public final Product create(String productName) {
		Product p = createProduct(productName);
		packingProduct(p);
		return p;
	} // Template Method
	
	protected Product createProduct(String name) throws StoreException { // Product 생성
		// 재정의하지 않을 시 예외 처리
		throw new StoreException();
	}
	
	protected abstract void packingProduct(Product product);

}
