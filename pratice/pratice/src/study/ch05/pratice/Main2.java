package study.ch05.pratice;

public class Main2 {
	public static void main(String[] args) {
		YooSooYeon2 obj1 = YooSooYeon2.getInstance();
		YooSooYeon2 obj2 = YooSooYeon2.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2의 값은 같습니다.");
		} else {
			System.out.println("obj1과 obj2의 값은 다릅니다.");
		}
		
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
	}
}
