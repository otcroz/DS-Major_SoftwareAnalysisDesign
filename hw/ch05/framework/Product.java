package hw.ch05.framework;

// 구체적인 제품들이 가져야 메소드를 정의한 추상 클래스
public abstract class Product {
	private int a;
    public abstract void use();
    //public abstract Product(int a);
    // 생성자를 선언? abstract에서 자식이 물려받아서 일을 하도록 하는 것.
    // 하지만 생성자는 상속이 되지 않음!!
}
