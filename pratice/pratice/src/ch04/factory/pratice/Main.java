package ch04.factory.pratice;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import ch04.factory.framework.Factory;
import ch04.factory.instance.IDCard;
import ch04.factory.instance.IdCardFactory;

public class Main {
	public static void main(String[] args) {
		// ���� �����
		Factory factory = new IdCardFactory();
				
		// ������ �̿��Ͽ� ��ǰ�� ����
		
		factory.create("������1");
		factory.create("������2");
		factory.create("������3");
		
		Vector v = ((IdCardFactory)factory).getOwners();
		
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(((IDCard)it.next()).getOwner());
		}
	}
}
