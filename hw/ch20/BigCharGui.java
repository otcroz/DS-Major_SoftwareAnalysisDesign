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
	private JTextField inputText = new JTextField(10); // 입력창
	private JButton ShareBtn;
	private JButton notShareBtn;
	private JTextField shareMemoryText;
	private JTextField notShareMemoryText;
	private JTextArea shareArea;
	private JTextArea notShareArea;
	
	public BigCharGui() {
		frame = new JFrame("20200818 유수연");

		buildGUI(); // GUI 메서드
		eventMethod(); // 이벤트 메서드
		
		frame.setSize(400, 500);
		frame.setVisible(true);
		
	}
	// 이벤트에 대한 메서드
	public void eventMethod() {
		ShareBtn.addActionListener(this);
		notShareBtn.addActionListener(this);
	}
	
	// GUI에 대한 메서드
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
	
	public JPanel createSharePanel() { // 공유 문자, 메모리 사용량, 결과 출력 패널
		JPanel panel = new JPanel();
		ShareBtn = new JButton("공유해서 큰 문자 생성");
		shareMemoryText = new JTextField(10);
		
		// 패널에 추가
		panel.add(ShareBtn);
		panel.add(shareMemoryText);
		
		// 스크롤이 있는 JScrollPane 생성
		shareArea = new JTextArea(10,15);
		JScrollPane scrollPane = new JScrollPane(shareArea);
		
		panel.add(scrollPane);
		
		return panel;
	}
	
	public JPanel createNotSharePanel() { // 비공유 문자, 메모리 사용량, 결과 출력 패널
		JPanel panel = new JPanel();
		
		notShareBtn = new JButton("공유하지 않고 큰 문자 생성");
		notShareMemoryText = new JTextField(10);
		
		// 패널에 추가
		panel.add(notShareBtn);
		panel.add(notShareMemoryText);
		
		// 스크롤이 있는 JScrollPane 생성
		notShareArea = new JTextArea(10,15);
		JScrollPane scrollPane = new JScrollPane(notShareArea);
		
		panel.add(scrollPane);
		
		return panel;
	}
	
    public void testAllocation(boolean shared) {
        String text = "";
    	String input = inputText.getText();
    	for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString(input, shared); // 큰 단위의 text를 매개변수로 넣음
            text = bsarray[i].print(); // text의 값을 String으로 가져옴
        }
    	if(shared) {
    		shareArea.setFont(new Font("바탕체", Font.PLAIN, 15)); // 글씨체 설정
    		shareArea.setText(""); // 초기화
    		shareArea.setText(text);
    	} else {
    		notShareArea.setFont(new Font("바탕체", Font.PLAIN, 15));
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
		if (e.getSource() == ShareBtn) { // "공유해서 큰 문자 생성" 버튼을 눌렀을 때
			testAllocation(true);
		}
		else if (e.getSource() == notShareBtn) { // "공유하지 않고 큰 문자 생성" 버튼을 눌렀을 때
			testAllocation(false);
		}
	}
}
