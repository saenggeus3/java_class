package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_JButton extends JFrame {
	
	public S02_JButton() {
		JButton button1 = new JButton("눌러보세요!");
		JButton button2 = new JButton("CLICK ME!");
		JButton button3 = new JButton(new ImageIcon("D:\\나무발발이\\1582176614.gif"));
		
		// setBountds : 위치와 크기설정
		button1.setBounds(20, 100, 100, 50);
		button2.setBounds(20, 250, 100, 50);
		button3.setBounds(120, 50, 512, 512);
		
		// setText : 컴포넌트의 텍스트를 변경함
		button1.setText("ok");
		button2.setText("클릭!");
		
		// setEnable : 버튼을 활성화/비활성화 한다
		button1.setEnabled(false);
		button2.setEnabled(true);
		
		// 버튼의 기본 동작 액션 리스너를 정의
		ActionListener basic_btn_action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 눌렸습니다.!");
				System.out.println("버튼 정보 : " + e.getSource());
				JButton clicked_btn = (JButton)e.getSource();
				System.out.println(e.getActionCommand());
				
				System.out.println("버튼의 이름 : " + clicked_btn.getText());
			}
		};
		
		// 버튼에 동작을 추가
		//	ActionListener 인터페이스의 구현체를 버튼에ㅓ 추가
		button1.addActionListener(basic_btn_action);
		button2.addActionListener(basic_btn_action);
		
		add(button1);
		add(button2);
		add(button3);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1350, 100);
		setSize(1280, 680);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S02_JButton();
		
	}

}
