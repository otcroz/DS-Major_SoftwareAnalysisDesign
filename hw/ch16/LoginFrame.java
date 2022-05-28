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

// 중재자 역할을 하는 클래스
public class LoginFrame extends Frame implements ActionListener, Mediator {
	// 프레임 내에서 사용될 Colleague 참조 변수들을 선언
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueCheckbox checkMember; // 멤버 CheckBox 추가

	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueTextField residentNum; // 주민등록번호 textField 추가

	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	// 생성자
	// Colleague들을 생성해서 배치한 후에 표시를 실행한다.
	public LoginFrame(String title) {
		super(title);
		// 배경색의 설정(setBackground( ) 이용)
		setBackground(Color.lightGray);
		setLayout(new GridLayout(5, 3));
		
		// Colleague들의 생성
		createColleagues();
		
		// 생성된 Colleague들을 배치
		add(checkGuest);
		add(checkLogin);
		add(checkMember);
		
		add(new Label("Username:"));
		add(textUser);
		add(new Label(""));
		
		add(new Label("Password:"));
		add(textPass);
		add(new Label(""));
		
		add(new Label("주민등록번호:"));
		add(residentNum);
		add(new Label(""));
		
		add(buttonOk);
		add(buttonCancel);
		
		// 각 체크박스 유효/무효를 초기화한다.
		colleagueChanged(checkGuest);
		
		// 표시
		pack(); // 포함된 컴포넌트들의 레이아웃(배치 상태)에 맞게 윈도우 크기를 조정한다.
		//show(); // 윈도우를 보여준다.
		setVisible(true); //show() 대신 사용하는 메서드
	}

	// Colleague들을 생성한다.
	public void createColleagues() {
		// Checkbox 생성 
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		checkMember = new ColleagueCheckbox("Member", g, false);
		
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*'); // 사용자가 텍스트를 입력하면 *이 표시되도록 함.
		residentNum = new ColleagueTextField("", 10);
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		// Mediator를 설정한다. 각 GUI 컴포넌트의 중재자는 현재 클래스 자신이다.
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		checkMember.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		residentNum.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		// Listener들을 설정한다.
		checkGuest.addItemListener(checkGuest); // 자신이 이벤트 리스너가 된다
		checkLogin.addItemListener(checkLogin); // 자신이 이벤트 리스너가 된다
		checkMember.addItemListener(checkMember);
		textUser.addTextListener(textUser); // 자신이 이벤트 리스너가 된다
		textPass.addTextListener(textPass); // 자신이 이벤트 리스너가 된다
		residentNum.addTextListener(residentNum); 
		buttonOk.addActionListener(this);  // LoginFrame에 ActionListener 역할을 한다고 선언하였기에 this로 선언
		buttonCancel.addActionListener(this);
	}

	// colleague의 상태가 변화했을 때, 호출되는 메소드
	// Colleague로부터의 통지가 오면, 통지의 종류를 파악하여 각 Colleague의 유효/무효를 판정한다.
	// colleague의 상태 변화에 따라 해당 colleague의 상태를 
	// 어떻게 변화시킬 것인가에 대한 로직을 가지고 있다.
	public void colleagueChanged(Colleague c) {
		// 상태변화가 발생한 곳이 checkGuest나 checkLogin이면...
		if (c == checkGuest || c == checkLogin || c == checkMember ) {
			if (checkGuest.getState()) { // checkGuest가 체크되었다면...
				textUser.setColleagueEnabled(false);
				textPass.setColleagueEnabled(false);
				residentNum.setColleagueEnabled(false); // 처음에 초기화
				buttonOk.setColleagueEnabled(true); 
			} else if(checkMember.getState()){
				textUser.setColleagueEnabled(true);
				userpassChanged();
			}
			else { // checkLogin이 체크되었다면...
				textUser.setColleagueEnabled(true);
				userpassChanged();  // user name 이나 password 텍스트필드가 바뀐 것이므로...
			}
		}
		// 상태변화가 발생한 곳이 textUser나 textPass이면...
		else if (c == textUser || c == textPass || c == residentNum) {
			userpassChanged();
		} else {
			System.out.println("colleagueChanged:unknown colleague = " + c);
		}
	}

	// TextField 상태 변화에 따라 버튼 활성화/비활성화한다.
	private void userpassChanged() {
		if (textUser.getText().length() > 0) { // textUser에 값이 들어가 있다면...
			textPass.setColleagueEnabled(true); // textPass를 유효화 시킨다.
			if (textPass.getText().length() > 0) { // textPass에 값이 들어가 있다면...
				residentNum.setColleagueEnabled(true);
				if (residentNum.getText().length() > 0) {
					if(Character.isDigit(residentNum.getText().charAt(residentNum.getText().length()-1)) == false) { // 사용자가 마지막에 입력한 값이 문자이면
						JOptionPane.showMessageDialog(this, "문자를 입력하지 마십시오.", "문자 입력 오류", JOptionPane.ERROR_MESSAGE); // 오류창 출력
						residentNum.setText(residentNum.getText().substring(0, residentNum.getText().length()-1)); // 입력했던 문자 삭제
						residentNum.setCaretPosition(residentNum.getText().length()); // 다시 그 위치부터 입력하도록
					} else {
						if(residentNum.getText().length() == 13) { //사용자가 입력한 문자의 수 = 13
							buttonOk.setColleagueEnabled(true); 
						} else { // 13이 아닐 때
							buttonOk.setColleagueEnabled(false); 
						}					
					} 
				}
			}
		} else { // user에 값이 들어가있지 않을 때
			textPass.setColleagueEnabled(false);
			residentNum.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
			}
	}

	// OK, Cancel 버튼이 눌러졌을 때 실행되는 메소드
	public void actionPerformed(ActionEvent e) { // 버튼이 눌려지면
		System.out.println("" + e); // 발생된 이벤트에 대한 설명을 화면에 출력하고
		System.exit(0); // 프로그램을 종료한다.
	}
}
