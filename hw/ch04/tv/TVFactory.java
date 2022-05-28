package hw.ch04.tv;

import java.util.Iterator;
import java.util.Vector;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class TVFactory extends Factory{

	private Vector modelNos = new Vector(); 
	
	public TV_YooSooYeon createProduct(String model) {
		return new TV_YooSooYeon(model); // TV_YooSooYeon Ÿ���� ��ü ���� �� ��ȯ
	}
	
	@Override
	protected void registerProduct(Product product) {
		modelNos.add(((TV_YooSooYeon)product).getModelNo()); // ������: product ����ȯ, �� ��ȣ�� ���Ϳ� �߰�
		
	}
	
	public void printAllModelNumbers(){ // ������: �� ��ȣ���� ���������� ���
		Iterator it = modelNos.iterator();
		
		while(it.hasNext()) {
			String num = (String)it.next();
			
			System.out.println(num);
		}
	}

}
