package study.ch04.chocolate;

import study.ch04.framework.Product;

public class Chocolate extends Product {

	private String chocolateName;
	
	public Chocolate(String chocolateName) {
		System.out.println(chocolateName +"을 만듭니다.");
		this.chocolateName = chocolateName;
	}
	
	@Override
	public void sale() {
		System.out.println(chocolateName + "을 판매합니다.");
	}
	
	public String getChocolateName() {
		return chocolateName;
	}

}
