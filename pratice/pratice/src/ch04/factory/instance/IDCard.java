package ch04.factory.instance;

import ch04.factory.framework.Product;

public class IDCard extends Product {

	String owner;
	
	IDCard(String owner) { // 누구나 생성할 수 없게 하도록
		this.owner = owner;
	}
	
	@Override
	protected void use() {
		System.out.println(owner + "의 IDCard를 사용합니다.");
	}
	
	public String getOwner() {
		return owner;
	}
	
}
