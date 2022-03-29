package study.ch04.chocolate;

import study.ch04.framework.Product;

public class Chocolate extends Product {

	private String chocolateName;
	
	public Chocolate(String chocolateName) {
		System.out.println(chocolateName +"�� ����ϴ�.");
		this.chocolateName = chocolateName;
	}
	
	@Override
	public void sale() {
		System.out.println(chocolateName + "�� �Ǹ��մϴ�.");
	}
	
	public String getChocolateName() {
		return chocolateName;
	}

}