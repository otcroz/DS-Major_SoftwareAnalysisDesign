package hw.ch19;

public class NightMealState implements State {

    private static NightMealState singleton = new NightMealState();
    private NightMealState() {                                // 생성자는 private
    }
    public static State getInstance() {                 // 유일한 하나의 인스턴스를 얻는다
        return singleton;
    }
	
	@Override
	public void doClock(Context context, int hour) {
        if ( 0 < hour && hour < 9 || 17 <= hour && hour < 20) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
        	context.changeState(DayState.getInstance());
        } else if (12 <= hour && hour < 13) {                   
            context.changeState(NoonState.getInstance());       
        }       
		
	}
	
	public void doUse(Context context) {                // 금고 사용
        context.callSecurityCenter("유수연-야식시간: 비상:야식시간 때의 금고사용!");
    }
    public void doAlarm(Context context) {              // 비상벨
        context.callSecurityCenter("유수연-야식시간: 비상벨(야식시간 때)");
    }
    public void doPhone(Context context) {              // 일반통화
        context.recordLog("유수연-야식시간: 야식시간 때의 통화 녹음");
    }
    public String toString() {                          // 문자열 표현
        return "[야식시간 때]";
    }
    
	@Override
	public void doCCTV(Context context) {
		context.recordLog("CCTV: Off");
		
	}


}
