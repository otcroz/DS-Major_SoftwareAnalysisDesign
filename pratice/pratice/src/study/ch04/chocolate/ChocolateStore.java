package study.ch04.chocolate;

import java.util.Vector;

import study.ch04.framework.Product;
import study.ch04.framework.Store;

public class ChocolateStore extends Store {

	private String chocolateName;
	private Vector chocolates = new Vector();
	
	protected Product createProduct(String chocolateName) {
		this.chocolateName = chocolateName;
		return new Chocolate(chocolateName);
	}
	
	@Override
	protected void packingProduct(Product chocolate) {
		System.out.println(chocolateName +"�� �����մϴ�.");
		chocolates.add(((Chocolate)chocolate).getChocolateName()); // ���ݷ��� �̸�(String)�� �߰�
	}
	
	public Vector getChocolates() {
		return chocolates;
	}

}