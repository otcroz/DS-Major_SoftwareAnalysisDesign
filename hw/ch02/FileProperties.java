package hw.ch02;

import java.io.*;
import java.util.*;


// Properties Ŭ������, �̹� �����ϴ� Ŭ�����̴�.
// FileProperties Ŭ������ ����� ������ �Ѵ�.
public class FileProperties extends Properties implements FileIO {
    
	Properties properity; // ������: ������ �̿��ϱ� ���� Properties Ÿ���� ���� ����
	
	public FileProperties() {
		properity = new Properties(); // ������: FileProperties�� ������ �� Properties Ÿ���� ���� ����
	}
	
	public void readFromFile(String filename) throws IOException {
		properity.load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
    	properity.store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value) {
    	properity.setProperty(key, value); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
    public String getValue(String key) {
        return properity.getProperty(key, ""); // ��ӹ��� Properties Ŭ������ �޼ҵ带 ȣ���Ѵ�.
    }
}
