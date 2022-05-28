package hw.ch17;

import java.util.Random;

public class PrimeNumberGenerator extends NumberGenerator {
	private Random random = new Random();   // 난수발생기
    private int number;                     // 현재의 수
    public int getNumber() {                // 수를 취득한다.
        return number;
    }
    
    public boolean isPrimeNumber(int num) { // 소수인지 확인
    	if(num < 2) {
    		return false;
    		
    	} 
    	else if (num == 2) {
    		return false;
    	} 
    	
    	for(int i=2; i< num; i++) {
    		if(num % i == 0) return false;
    	}
    	
    	return true; // 소수인 경우
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
