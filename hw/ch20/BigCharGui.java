package hw.ch20;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BigCharGui implements ActionListener {
	private BigString[] bsarray = new BigString[1000];
	
	private JFrame frame;
	private JTextField inputText = new JTextField(10); // �Է�â
	private JButton ShareBtn;
	private JButton notShareBtn;
	private JTextField shareMemoryText;
	private JTextField notShareMemoryText;
	private JTextArea shareArea;
	private JTextArea notShareArea;
	
	public BigCharGui() {
		frame = new JFrame("20200818 ������");

		buildGUI(); // GUI �޼���
		eventMethod(); // �̺�Ʈ �޼���
		
		frame.setSize(400, 500);
		frame.setVisible(true);
		
	}
	// �̺�Ʈ�� ���� �޼���
	public void eventMethod() {
		ShareBtn.addActionListener(this);
		notShareBtn.addActionListener(this);
	}
	
	// GUI�� ���� �޼���
	public void buildGUI() {
		frame.setLayout(new BorderLayout());
		frame.add(inputText, BorderLayout.NORTH);
		frame.add(createTotalPanel(), BorderLayout.CENTER);
		
	}
	
	public JPanel createTotalPanel() { 
		JPanel panel = new JPanel(new GridLayout(0,2));
		panel.add(createSharePanel());
		panel.add(createNotSharePanel());
		
		return panel;
	}
	
	public JPanel createSharePanel() { // ���� ����, �޸� ��뷮, ��� ��� �г�
		JPanel panel = new JPanel();
		ShareBtn = new JButton("�����ؼ� ū ���� ����");
		shareMemoryText = new JTextField(10);
		
		// �гο� �߰�
		panel.add(ShareBtn);
		panel.add(shareMemoryText);
		
		// ��ũ���� �ִ� JScrollPane ����
		shareArea = new JTextArea(10,15);
		JScrollPane scrollPane = new JScrollPane(shareArea);
		
		panel.add(scrollPane);
		
		return panel;
	}
	
	public JPanel createNotSharePanel() { // ����� ����, �޸� ��뷮, ��� ��� �г�
		JPanel panel = new JPanel();
		
		notShareBtn = new JButton("�������� �ʰ� ū ���� ����");
		notShareMemoryText = new JTextField(10);
		
		// �гο� �߰�
		panel.add(notShareBtn);
		panel.add(notShareMemoryText);
		
		// ��ũ���� �ִ� JScrollPane ����
		notShareArea = new JTextArea(10,15);
		JScrollPane scrollPane = new JScrollPane(notShareArea);
		
		panel.add(scrollPane);
		
		return panel;
	}
	
    public void testAllocation(boolean shared) {
        String text = "";
    	String input = inputText.getText();
    	for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString(input, shared); // ū ������ text�� �Ű������� ����
            text = bsarray[i].print(); // text�� ���� String���� ������
        }
    	if(shared) {
    		shareArea.setFont(new Font("����ü", Font.PLAIN, 15)); // �۾�ü ����
    		shareArea.setText(""); // �ʱ�ȭ
    		shareArea.setText(text);
    	} else {
    		notShareArea.setFont(new Font("����ü", Font.PLAIN, 15));
    		notShareArea.setText("");
    		notShareArea.setText(text);
    	}
        showMemory(shared);
    }
    
    public void showMemory(boolean shared) {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
    	if(shared) {
    		shareMemoryText.setText(Long.toString(used));
    	} 
    	else {
    		notShareMemoryText.setText(Long.toString(used));
    	}
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ShareBtn) { // "�����ؼ� ū ���� ����" ��ư�� ������ ��
			testAllocation(true);
		}
		else if (e.getSource() == notShareBtn) { // "�������� �ʰ� ū ���� ����" ��ư�� ������ ��
			testAllocation(false);
		}
	}
}
