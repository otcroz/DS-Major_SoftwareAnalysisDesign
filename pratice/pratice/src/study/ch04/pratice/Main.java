package study.ch04.pratice;

import java.util.Iterator;

import study.ch04.chocolate.ChocolateStore;
import study.ch04.cookie.Cookie;
import study.ch04.cookie.CookieStore;
import study.ch04.framework.Product;
import study.ch04.framework.Store;

public class Main {

	public static void main(String[] args) {
		// 1. CookieStore
		Store store = new CookieStore();
		
		//Store의 create를 통해 쿠키를 만듦(만들고 포장)
		Product cookie1 = store.create("초콜릿 쿠키");
		Product cookie2 = store.create("버터 쿠키");
		
		//쿠키를 판매함
		cookie1.sale();
		cookie2.sale();
		
		//쿠키 이름 목록 출력
		Iterator it = ((CookieStore)store).getCookies().iterator(); // 벡터를 얻어옴
		while(it.hasNext()) {
			System.out.println(it.next());
			Cookie cookie = (Cookie)it.next(); // 캐스팅이 필요한 이유?? it이 반환하는 타입은 Object
			
		}
		
		System.out.println();
		
		// 2. ChocolateStore
		store = new ChocolateStore();
		
		// 초콜릿을 만들고 포장함
		Product Chocolate1 = store.create("다크 초콜릿");
		Product Chocolate2 = store.create("화이트 초콜릿");
		
		// 초콜릿을 판매함
		Chocolate1.sale();
		Chocolate2.sale();
		
		// 초콜릿 이름 목록 출력
		it = ((ChocolateStore)store).getChocolates().iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
