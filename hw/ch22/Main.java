package hw.ch22;
import hw.ch22.command.*;
import hw.ch22.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // �׸��� �̷�
    private MacroCommand history = new MacroCommand();
    //  �׸��� ����
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // ���� ��ư
    private JButton clearButton  = new JButton("clear");
    // ���� ��ư                                           
    private JButton redButton  = new JButton("red");        
    // ��� ��ư                                           
    private JButton greenButton  = new JButton("green");    
    // �Ķ� ��ư                                          
    private JButton blueButton  = new JButton("blue");      
    // �ڷ� ���� ��ư
    private JButton undoButton  = new JButton("undo");   
    // �ٽ� ���� ��ư
    private JButton redoButton  = new JButton("redo");   

    // ������
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        redButton.addActionListener(this);      
        greenButton.addActionListener(this);    
        blueButton.addActionListener(this);     
        undoButton.addActionListener(this);
        redoButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(redButton);   
        buttonBox.add(greenButton); 
        buttonBox.add(blueButton);  
        buttonBox.add(undoButton);
        buttonBox.add(redoButton);
        
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        
        // ���� �ʱ�ȭ
        Command cmd = new ColorCommand(canvas, Color.red);  
        history.append(cmd);

        pack();
        setVisible(true);
    }

    // ActionListener��
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            
            Command cmd = new ColorCommand(canvas, Color.red);  
            history.append(cmd); // ���� �ʱ�ȭ
            
            canvas.init();
            canvas.repaint();
        } else if (e.getSource() == redButton) {                
            Command cmd = new ColorCommand(canvas, Color.red);  
            history.append(cmd);                                
            cmd.execute();                                      
        } else if (e.getSource() == greenButton) {              
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);                                
            cmd.execute();                                      
        } else if (e.getSource() == blueButton) {               
            Command cmd = new ColorCommand(canvas, Color.blue); 
            history.append(cmd);                                
            cmd.execute();                                      
        } else if (e.getSource() == undoButton) { // �ڷΰ��� ��ư�� ������ ���
        	history.undo();
            canvas.repaint(); // ��ü�� ���� �׷���             
        } else if (e.getSource() == redoButton) { // �ڷΰ��� ��ư�� ������ ���
        	history.redo();              
            canvas.repaint(); // ��ü�� ���� �׷���             
        }
    }

    // MouseMotionListener��
    public void mouseMoved(MouseEvent e) {
    }
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener��
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
