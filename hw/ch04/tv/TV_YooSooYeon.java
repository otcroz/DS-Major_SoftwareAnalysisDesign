package hw.ch04.tv;

import ch04.Sample.framework.Product;

public class TV_YooSooYeon extends Product {
	String modelNo;
	
	public TV_YooSooYeon(String modelNo){
		this.modelNo = modelNo;
	}

	@Override
	public void use() {
		System.out.println("모델번호 " + modelNo + "인 TV를 사용합니다");
		
	}
	
	public String getModelNo() {
		return modelNo;
	}
}
