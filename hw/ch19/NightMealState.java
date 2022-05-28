package hw.ch19;

public class NightMealState implements State {

    private static NightMealState singleton = new NightMealState();
    private NightMealState() {                                // �����ڴ� private
    }
    public static State getInstance() {                 // ������ �ϳ��� �ν��Ͻ��� ��´�
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
	
	public void doUse(Context context) {                // �ݰ� ���
        context.callSecurityCenter("������-�߽Ľð�: ���:�߽Ľð� ���� �ݰ���!");
    }
    public void doAlarm(Context context) {              // ���
        context.callSecurityCenter("������-�߽Ľð�: ���(�߽Ľð� ��)");
    }
    public void doPhone(Context context) {              // �Ϲ���ȭ
        context.recordLog("������-�߽Ľð�: �߽Ľð� ���� ��ȭ ����");
    }
    public String toString() {                          // ���ڿ� ǥ��
        return "[�߽Ľð� ��]";
    }
    
	@Override
	public void doCCTV(Context context) {
		context.recordLog("CCTV: Off");
		
	}


}
