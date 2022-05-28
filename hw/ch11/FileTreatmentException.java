package hw.ch11;

// 예외 클래스
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) { // 메시지를 받아서 부모 생성자 호출
        super(msg);
    }
}
