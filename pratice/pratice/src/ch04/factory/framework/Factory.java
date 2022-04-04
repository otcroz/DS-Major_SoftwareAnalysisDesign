package ch04.factory.framework;

abstract public class Factory {
	final public void  create(String name){ // Template Method 패턴
		Product p = createProduct(name);
		registerProduct(p);
	}
	
	protected abstract Product createProduct(String string);
		// throws // 에러 클래스
		// throw new // 에러


	protected abstract void registerProduct(Product p);

	
	
}
