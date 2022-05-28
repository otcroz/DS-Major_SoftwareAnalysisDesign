package hw.ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener { // 전체 프레임
	private GraphText textGraph = new GraphText(60);
	private GraphNamePrint textNameGraph = new GraphNamePrint(60); // GraphNamePrint 클래스의 인스턴스 생성

	private GraphCanvas canvasGraph = new GraphCanvas();

	private Button buttonClose = new Button("Close");

	public FrameObserver() {
		super("FrameObserver");
		// BorderLayout는 GUI 컴포넌트를 동서남북,중앙 중 하나에 배치한다.
		setLayout(new BorderLayout());

		setBackground(Color.lightGray);
		textGraph.setEditable(false);
		textNameGraph.setEditable(false);
		canvasGraph.setSize(500, 500);

		// 패널 생성
		Panel panel = new Panel(new GridLayout(2,0));
		panel.add(textGraph);
		panel.add(textNameGraph);
		
		// 각 GUI 컴포넌트를 북, 중앙, 남에 단다.
		add(panel, BorderLayout.NORTH);
		add(canvasGraph, BorderLayout.CENTER);
		add(buttonClose, BorderLayout.SOUTH);
		// Close 버튼이 눌려질 때의 ActionListener를 등록한다.
		buttonClose.addActionListener(this);
		
		pack(); // 프레임 크기를 조절한다.
		//show(); // 화면에 보인다.
		
		setVisible(true);
	}

	// Close 버튼이 눌려질 때 호출된다.
	public void actionPerformed(ActionEvent e) {
		System.out.println("" + e);
		System.exit(0);
	}

	public void update(NumberGenerator generator) {
		textGraph.update(generator);
		canvasGraph.update(generator);
		textNameGraph.update(generator);
	}
}

class GraphNamePrint extends TextField implements Observer{
	public GraphNamePrint(int columns) {
		super(columns);
	}
	
	@Override
	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":"; // 문자열 형태
		for (int i = 0; i < number; i++) {
			text += "유수연 "; // 이름 출력
		}
		setText(text); // 텍스트 필드에 text를 출력한다.
		
	}
	
}

class GraphText extends TextField implements Observer { // 옵저버(관찰자) + 텍스트 필드 
	public GraphText(int columns) {
		super(columns);
	}

	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":"; // 문자열 형태
		for (int i = 0; i < number; i++) {
			text += '*';
		}
		setText(text); // 텍스트 필드에 text를 출력한다.
	}
}

// Canvas: 그림 그릴 수 있는 빈 사각형을 나타내는 클래스
class GraphCanvas extends Canvas implements Observer { // 옵저버(관찰자) + 캔버스
	private int number;

	public void update(NumberGenerator generator) {
		number = generator.getNumber();
		repaint();  // paint() 메소드를 자동으로 호출한다.
	}

	// Graphics: 그림 그리기 위한 여러 가지 메소드와 
	// 그리기 관련 정보(색깔, 폰트 등)를 가지고 있는 클래스
	// paint() 메소드는 Graphics 객체를 인자로 전달받는다.
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		// 현재 색을 흰색으로 설정한다.
		g.setColor(Color.white);
		// 0도에서 360까지 원호를 그린다.
		g.fillArc(0, 0, width, height, 0, 360); // 흰색 원호를 그린다.
        // 현재 색을 빨간색으로 설정한다.
		g.setColor(Color.red);
		// 90도에서 시계방향으로 원호를 그린다.
		g.fillArc(0, 0, width, height, 90, -number * 360 / 50); // 빨간색 원호를 그려줌, number의 범위가 50이기 때문에 50으로 나누어줌? 뭔소리야
	}
}
