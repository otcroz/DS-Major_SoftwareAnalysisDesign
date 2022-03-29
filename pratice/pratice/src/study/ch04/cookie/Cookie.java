package study.ch04.cookie;

import study.ch04.framework.Product;

public class Cookie extends Product{

	private String cookieName;
	
	Cookie(String cookieName){
		System.out.println(cookieName + "�� ����ϴ�.");
		this.cookieName = cookieName;
	}
	
	@Override
	public void sale() {
		System.out.println(cookieName +"�� �Ǹ��մϴ�.");
		
	}
	
	public String getChocolateName() {
		return cookieName;
	}

}