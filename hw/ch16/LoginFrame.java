package hw.ch16;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;

// ������ ������ �ϴ� Ŭ����
public class LoginFrame extends Frame implements ActionListener, Mediator {
	// ������ ������ ���� Colleague ���� �������� ����
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueCheckbox checkMember; // ��� CheckBox �߰�

	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueTextField residentNum; // �ֹε�Ϲ�ȣ textField �߰�

	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	// ������
	// Colleague���� �����ؼ� ��ġ�� �Ŀ� ǥ�ø� �����Ѵ�.
	public LoginFrame(String title) {
		super(title);
		// ������ ����(setBackground( ) �̿�)
		setBackground(Color.lightGray);
		setLayout(new GridLayout(5, 3));
		
		// Colleague���� ����
		createColleagues();
		
		// ������ Colleague���� ��ġ
		add(checkGuest);
		add(checkLogin);
		add(checkMember);
		
		add(new Label("Username:"));
		add(textUser);
		add(new Label(""));
		
		add(new Label("Password:"));
		add(textPass);
		add(new Label(""));
		
		add(new Label("�ֹε�Ϲ�ȣ:"));
		add(residentNum);
		add(new Label(""));
		
		add(buttonOk);
		add(buttonCancel);
		
		// �� üũ�ڽ� ��ȿ/��ȿ�� �ʱ�ȭ�Ѵ�.
		colleagueChanged(checkGuest);
		
		// ǥ��
		pack(); // ���Ե� ������Ʈ���� ���̾ƿ�(��ġ ����)�� �°� ������ ũ�⸦ �����Ѵ�.
		//show(); // �����츦 �����ش�.
		setVisible(true); //show() ��� ����ϴ� �޼���
	}

	// Colleague���� �����Ѵ�.
	public void createColleagues() {
		// Checkbox ���� 
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		checkMember = new ColleagueCheckbox("Member", g, false);
		
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*'); // ����ڰ� �ؽ�Ʈ�� �Է��ϸ� *�� ǥ�õǵ��� ��.
		residentNum = new ColleagueTextField("", 10);
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		// Mediator�� �����Ѵ�. �� GUI ������Ʈ�� �����ڴ� ���� Ŭ���� �ڽ��̴�.
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		checkMember.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		residentNum.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		// Listener���� �����Ѵ�.
		checkGuest.addItemListener(checkGuest); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		checkLogin.addItemListener(checkLogin); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		checkMember.addItemListener(checkMember);
		textUser.addTextListener(textUser); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		textPass.addTextListener(textPass); // �ڽ��� �̺�Ʈ �����ʰ� �ȴ�
		residentNum.addTextListener(residentNum); 
		buttonOk.addActionListener(this);  // LoginFrame�� ActionListener ������ �Ѵٰ� �����Ͽ��⿡ this�� ����
		buttonCancel.addActionListener(this);
	}

	// colleague�� ���°� ��ȭ���� ��, ȣ��Ǵ� �޼ҵ�
	// Colleague�κ����� ������ ����, ������ ������ �ľ��Ͽ� �� Colleague�� ��ȿ/��ȿ�� �����Ѵ�.
	// colleague�� ���� ��ȭ�� ���� �ش� colleague�� ���¸� 
	// ��� ��ȭ��ų ���ΰ��� ���� ������ ������ �ִ�.
	public void colleagueChanged(Colleague c) {
		// ���º�ȭ�� �߻��� ���� checkGuest�� checkLogin�̸�...
		if (c == checkGuest || c == checkLogin || c == checkMember ) {
			if (checkGuest.getState()) { // checkGuest�� üũ�Ǿ��ٸ�...
				textUser.setColleagueEnabled(false);
				textPass.setColleagueEnabled(false);
				residentNum.setColleagueEnabled(false); // ó���� �ʱ�ȭ
				buttonOk.setColleagueEnabled(true); 
			} else if(checkMember.getState()){
				textUser.setColleagueEnabled(true);
				userpassChanged();
			}
			else { // checkLogin�� üũ�Ǿ��ٸ�...
				textUser.setColleagueEnabled(true);
				userpassChanged();  // user name �̳� password �ؽ�Ʈ�ʵ尡 �ٲ� ���̹Ƿ�...
			}
		}
		// ���º�ȭ�� �߻��� ���� textUser�� textPass�̸�...
		else if (c == textUser || c == textPass || c == residentNum) {
			userpassChanged();
		} else {
			System.out.println("colleagueChanged:unknown colleague = " + c);
		}
	}

	// TextField ���� ��ȭ�� ���� ��ư Ȱ��ȭ/��Ȱ��ȭ�Ѵ�.
	private void userpassChanged() {
		if (textUser.getText().length() > 0) { // textUser�� ���� �� �ִٸ�...
			textPass.setColleagueEnabled(true); // textPass�� ��ȿȭ ��Ų��.
			if (textPass.getText().length() > 0) { // textPass�� ���� �� �ִٸ�...
				residentNum.setColleagueEnabled(true);
				if (residentNum.getText().length() > 0) {
					if(Character.isDigit(residentNum.getText().charAt(residentNum.getText().length()-1)) == false) { // ����ڰ� �������� �Է��� ���� �����̸�
						JOptionPane.showMessageDialog(this, "���ڸ� �Է����� ���ʽÿ�.", "���� �Է� ����", JOptionPane.ERROR_MESSAGE); // ����â ���
						residentNum.setText(residentNum.getText().substring(0, residentNum.getText().length()-1)); // �Է��ߴ� ���� ����
						residentNum.setCaretPosition(residentNum.getText().length()); // �ٽ� �� ��ġ���� �Է��ϵ���
					} else {
						if(residentNum.getText().length() == 13) { //����ڰ� �Է��� ������ �� = 13
							buttonOk.setColleagueEnabled(true); 
						} else { // 13�� �ƴ� ��
							buttonOk.setColleagueEnabled(false); 
						}					
					} 
				}
			}
		} else { // user�� ���� ������ ���� ��
			textPass.setColleagueEnabled(false);
			residentNum.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
			}
	}

	// OK, Cancel ��ư�� �������� �� ����Ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent e) { // ��ư�� ��������
		System.out.println("" + e); // �߻��� �̺�Ʈ�� ���� ������ ȭ�鿡 ����ϰ�
		System.exit(0); // ���α׷��� �����Ѵ�.
	}
}
