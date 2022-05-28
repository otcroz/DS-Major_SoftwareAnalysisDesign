package hw.ch05.framework;

import ch04.Sample.framework.FacatoryMethodRuntimeException;


public abstract class Factory {
	// 물건 만들고, 등록하는 일을 하는 메소드 (템플릿메소드이다)
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

	// 하위 클래스(구체적인 공장)에서 구현하는 메소드들
    //protected abstract Product createProduct(String owner);
    protected Product createProduct(String owner) throws FacatoryMethodRuntimeException { // 디폴트 구현
    	throw new FacatoryMethodRuntimeException(); // createProduct를 호출하면 예외 객체를 발생시킨다.
    	// createProduct를 재정의 하지 않으면 예외를 호출하도록 함.
    }

    
    protected abstract void registerProduct(Product product);
}

