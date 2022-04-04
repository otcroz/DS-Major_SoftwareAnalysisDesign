package ch04.factory.instance;

import java.util.Vector;

import ch04.factory.framework.Factory;
import ch04.factory.framework.Product;

public class IdCardFactory extends Factory {

	private Vector<IDCard> owners = new Vector<IDCard>();
	
	@Override
	protected Product createProduct(String name) {
		System.out.println( name + " 카드가 생성되었다!");
		return new IDCard(name);
	}

	@Override
	protected void registerProduct(Product p) {
		System.out.println("카드를 등록하였다!");
		owners.add((IDCard)p); // 배열에 등록
	}
	
	public Vector getOwners() {
		return owners;
	}

}
