package study.ch05.pratice;

public class Main1 {
	public static void main(String[] args) {
		YooSooYeon1 obj1 = YooSooYeon1.getInstance();
		YooSooYeon1 obj2 = YooSooYeon1.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1�� obj2�� ���� �����ϴ�.");
		} else {
			System.out.println("obj1�� obj2�� ���� �ٸ��ϴ�.");
		}
		
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
	}
	
}
