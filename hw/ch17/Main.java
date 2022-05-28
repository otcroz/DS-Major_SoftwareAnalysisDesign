package hw.ch17;
public class Main {
    public static void main(String[] args) {
    	System.out.println("20200818 유수연");
    	// 관찰대상
        NumberGenerator png = new PrimeNumberGenerator();
        
        // 관찰자들
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new NamePrintObserver();
        
        // 프레임 옵저버 생성
        Observer observer4 = new FrameObserver();
        
        png.addObserver(observer1);
        png.addObserver(observer2);
        png.addObserver(observer3);
        png.addObserver(observer4);
        
        png.execute();
    }
}
