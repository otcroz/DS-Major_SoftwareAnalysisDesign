package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
	private Random random = new Random();   // �����߻���
    private int number;                     // ������ ��
    public int getNumber() {                // ���� ����Ѵ�.
        return number;
    }
    
    public boolean isPrimeNumber(int num) { // �Ҽ����� Ȯ��
    	if(num < 2) {
    		return false;
    		
    	} 
    	else if (num == 2) {
    		return false;
    	} 
    	
    	for(int i=2; i< num; i++) {
    		if(num % i == 0) return false;
    	}
    	
    	return true; // �Ҽ��� ���
    }
    
    public void execute() {
        for (int i = 0; i < 100; i++) {
            number = random.nextInt(100) + 1;
            if(isPrimeNumber(number)) notifyObservers();  
 	            		
    		try {
    			Thread.sleep(1500);
    		} catch (InterruptedException e) {
    		}
        }
    }
}
