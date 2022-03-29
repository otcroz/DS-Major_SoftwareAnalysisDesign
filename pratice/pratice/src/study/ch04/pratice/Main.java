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
		
		//Store�� create�� ���� ��Ű�� ����(����� ����)
		Product cookie1 = store.create("���ݸ� ��Ű");
		Product cookie2 = store.create("���� ��Ű");
		
		//��Ű�� �Ǹ���
		cookie1.sale();
		cookie2.sale();
		
		//��Ű �̸� ��� ���
		Iterator it = ((CookieStore)store).getCookies().iterator(); // ���͸� ����
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		// 2. ChocolateStore
		store = new ChocolateStore();
		
		// ���ݸ��� ����� ������
		Product Chocolate1 = store.create("��ũ ���ݸ�");
		Product Chocolate2 = store.create("ȭ��Ʈ ���ݸ�");
		
		// ���ݸ��� �Ǹ���
		Chocolate1.sale();
		Chocolate2.sale();
		
		// ���ݸ� �̸� ��� ���
		it = ((ChocolateStore)store).getChocolates().iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
