package ch05.pratice.singleton;

public class Main1 {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) System.out.println("obj1�� obj2�� ���� ��ü�Դϴ�.");
		else System.out.println("obj1�� obj2�� �ٸ� ��ü�Դϴ�.");
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
