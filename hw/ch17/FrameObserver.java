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

public class FrameObserver extends Frame implements Observer, ActionListener { // ��ü ������
	private GraphText textGraph = new GraphText(60);
	private GraphNamePrint textNameGraph = new GraphNamePrint(60); // GraphNamePrint Ŭ������ �ν��Ͻ� ����

	private GraphCanvas canvasGraph = new GraphCanvas();

	private Button buttonClose = new Button("Close");

	public FrameObserver() {
		super("FrameObserver");
		// BorderLayout�� GUI ������Ʈ�� ��������,�߾� �� �ϳ��� ��ġ�Ѵ�.
		setLayout(new BorderLayout());

		setBackground(Color.lightGray);
		textGraph.setEditable(false);
		textNameGraph.setEditable(false);
		canvasGraph.setSize(500, 500);

		// �г� ����
		Panel panel = new Panel(new GridLayout(2,0));
		panel.add(textGraph);
		panel.add(textNameGraph);
		
		// �� GUI ������Ʈ�� ��, �߾�, ���� �ܴ�.
		add(panel, BorderLayout.NORTH);
		add(canvasGraph, BorderLayout.CENTER);
		add(buttonClose, BorderLayout.SOUTH);
		// Close ��ư�� ������ ���� ActionListener�� ����Ѵ�.
		buttonClose.addActionListener(this);
		
		pack(); // ������ ũ�⸦ �����Ѵ�.
		//show(); // ȭ�鿡 ���δ�.
		
		setVisible(true);
	}

	// Close ��ư�� ������ �� ȣ��ȴ�.
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
		String text = number + ":"; // ���ڿ� ����
		for (int i = 0; i < number; i++) {
			text += "������ "; // �̸� ���
		}
		setText(text); // �ؽ�Ʈ �ʵ忡 text�� ����Ѵ�.
		
	}
	
}

class GraphText extends TextField implements Observer { // ������(������) + �ؽ�Ʈ �ʵ� 
	public GraphText(int columns) {
		super(columns);
	}

	public void update(NumberGenerator generator) {
		int number = generator.getNumber();
		String text = number + ":"; // ���ڿ� ����
		for (int i = 0; i < number; i++) {
			text += '*';
		}
		setText(text); // �ؽ�Ʈ �ʵ忡 text�� ����Ѵ�.
	}
}

// Canvas: �׸� �׸� �� �ִ� �� �簢���� ��Ÿ���� Ŭ����
class GraphCanvas extends Canvas implements Observer { // ������(������) + ĵ����
	private int number;

	public void update(NumberGenerator generator) {
		number = generator.getNumber();
		repaint();  // paint() �޼ҵ带 �ڵ����� ȣ���Ѵ�.
	}

	// Graphics: �׸� �׸��� ���� ���� ���� �޼ҵ�� 
	// �׸��� ���� ����(����, ��Ʈ ��)�� ������ �ִ� Ŭ����
	// paint() �޼ҵ�� Graphics ��ü�� ���ڷ� ���޹޴´�.
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		// ���� ���� ������� �����Ѵ�.
		g.setColor(Color.white);
		// 0������ 360���� ��ȣ�� �׸���.
		g.fillArc(0, 0, width, height, 0, 360); // ��� ��ȣ�� �׸���.
        // ���� ���� ���������� �����Ѵ�.
		g.setColor(Color.red);
		// 90������ �ð�������� ��ȣ�� �׸���.
		g.fillArc(0, 0, width, height, 90, -number * 360 / 50); // ������ ��ȣ�� �׷���, number�� ������ 50�̱� ������ 50���� ��������? ���Ҹ���
	}
}
