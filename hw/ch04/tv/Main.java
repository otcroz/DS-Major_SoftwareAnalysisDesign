package hw.ch04.tv;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("20200818 유수연");
		
		// 유수연: Factory(TVFactory) 생성
		Factory factory = new TVFactory();
		
		// 유수연: Product(TV) 생성
		Product tv1 = factory.create("20200818");
		Product tv2 = factory.create("111");
		Product tv3 = factory.create("222");
		Product tv4 = factory.create("333");
		
		tv1.use();
		tv2.use();
		tv3.use();
		tv4.use();
		
		System.out.println();
		
		// 유수연: 모든 TV의 모델번호 출력
		((TVFactory)factory).printAllModelNumbers();
		

	}

}
