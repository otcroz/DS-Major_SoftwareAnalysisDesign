package hw.ch02;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("20200818 À¯¼ö¿¬");
    	FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2019");
            f.setValue("bornYear", "2000");
            f.setValue("StudentId", "20200818");
            f.setValue("Name", "Yoo soo yeon");
            f.setValue("Location", "Seoul");
            f.writeToFile("YooSooYeon.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
