package hw.ch05.idcard;

import hw.ch05.framework.Product;

public class IDCard extends Product {
    private String owner;

    // private�̳� public ���� ����Ǿ� ���� ������, 
    // ���� ��Ű���� ���� Ŭ�����鸸�� �� �����ڸ� ȣ���� �� �ִ�.
    IDCard(String owner) {
    	// �θ��� ���ھ��� �����ڸ� ���� ȣ�� 
    	// super();
    	// �θ��� �����ִ� �����ڸ� ȣ��: super(a, b);
        System.out.println(owner + "�� ī�带 ����ϴ�.");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "�� ī�带 ����մϴ�.");
    }
    public String getOwner() {
        return owner;
    }
}
