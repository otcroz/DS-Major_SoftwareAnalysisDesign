package hw.ch04.tv;

import java.util.Iterator;
import java.util.Vector;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class TVFactory extends Factory{

	private Vector modelNos = new Vector(); 
	
	public TV_YooSooYeon createProduct(String model) {
		return new TV_YooSooYeon(model); // TV_YooSooYeon 타입의 객체 생성 및 반환
	}
	
	@Override
	protected void registerProduct(Product product) {
		modelNos.add(((TV_YooSooYeon)product).getModelNo()); // 유수연: product 형번환, 모델 번호를 벡터에 추가
		
	}
	
	public void printAllModelNumbers(){ // 유수연: 모델 번호들을 순차적으로 출력
		Iterator it = modelNos.iterator();
		
		while(it.hasNext()) {
			String num = (String)it.next();
			
			System.out.println(num);
		}
	}

}
