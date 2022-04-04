package ch02.pratice.adapter;

interface Print {
	public abstract void printWeak();
	public abstract void printStrong();
}

// 위임: Banner을 Adapter 클래스에 참조 변수 생성
// 상속: Print를 implement, Banner을 extends
