package hw.ch02;

import java.io.*;
import java.util.*;


// Properties 클래스는, 이미 존재하는 클래스이다.
// FileProperties 클래스가 어댑터 역할을 한다.
public class FileProperties extends Properties implements FileIO {
    
	Properties properity; // 유수연: 위임을 이용하기 위해 Properties 타입의 변수 선언
	
	public FileProperties() {
		properity = new Properties(); // 유수연: FileProperties을 생성할 때 Properties 타입의 변수 선언
	}
	
	public void readFromFile(String filename) throws IOException {
		properity.load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
    	properity.store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
    	properity.setProperty(key, value); // 상속받은 Properties 클래스의 메소드를 호출한다.
    }
    public String getValue(String key) {
        return properity.getProperty(key, ""); // 상속받은 Properties 클래스의 메소드를 호출한다.
    }
}
