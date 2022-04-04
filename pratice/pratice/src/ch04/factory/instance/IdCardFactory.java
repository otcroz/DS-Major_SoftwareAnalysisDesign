package ch04.factory.instance;

import java.util.Vector;

import ch04.factory.framework.Factory;
import ch04.factory.framework.Product;

public class IdCardFactory extends Factory {

	private Vector<IDCard> owners = new Vector<IDCard>();
	
	@Override
	protected Product createProduct(String name) {
		System.out.println( name + " ī�尡 �����Ǿ���!");
		return new IDCard(name);
	}

	@Override
	protected void registerProduct(Product p) {
		System.out.println("ī�带 ����Ͽ���!");
		owners.add((IDCard)p); // �迭�� ���
	}
	
	public Vector getOwners() {
		return owners;
	}

}
