package ch04.factory.pratice;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import ch04.factory.framework.Factory;
import ch04.factory.instance.IDCard;
import ch04.factory.instance.IdCardFactory;

public class Main {
	public static void main(String[] args) {
		// 공장 세우기
		Factory factory = new IdCardFactory();
				
		// 공장을 이용하여 제품을 생산
		
		factory.create("유수연1");
		factory.create("유수연2");
		factory.create("유수연3");
		
		Vector v = ((IdCardFactory)factory).getOwners();
		
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(((IDCard)it.next()).getOwner());
		}
	}
}
