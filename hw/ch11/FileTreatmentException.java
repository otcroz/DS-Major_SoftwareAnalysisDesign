package hw.ch11;

// ���� Ŭ����
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) { // �޽����� �޾Ƽ� �θ� ������ ȣ��
        super(msg);
    }
}
