package study.ch04.cookie;

import java.util.Vector;

import study.ch04.framework.Product;
import study.ch04.framework.Store;

public class CookieStore extends Store {
	
	private String name;
	private Vector cookies = new Vector();
	
	protected Product createProduct(String name) {
		this.name = name;
		return new Cookie(name);
	}
	
	@Override
	protected void packingProduct(Product cookie) { // ������ + ���Ϳ� �� �߰�
		System.out.println(name + "�� �����մϴ�.");
		cookies.add(((Cookie)cookie).getChocolateName()); // ���ݸ� �̸��� ���Ϳ� �߰�
	}
	
	public Vector getCookies() {
		return cookies;
	}
}
