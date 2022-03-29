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
	protected void packingProduct(Product cookie) { // 포장함 + 벡터에 값 추가
		System.out.println(name + "를 포장합니다.");
		cookies.add(((Cookie)cookie).getChocolateName()); // 초콜릿 이름을 벡터에 추가
	}
	
	public Vector getCookies() {
		return cookies;
	}
}
