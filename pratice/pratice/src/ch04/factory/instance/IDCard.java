package ch04.factory.instance;

import ch04.factory.framework.Product;

public class IDCard extends Product {

	String owner;
	
	IDCard(String owner) { // ������ ������ �� ���� �ϵ���
		this.owner = owner;
	}
	
	@Override
	protected void use() {
		System.out.println(owner + "�� IDCard�� ����մϴ�.");
	}
	
	public String getOwner() {
		return owner;
	}
	
}