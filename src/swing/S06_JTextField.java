package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class S06_JTextField extends JFrame{

	public S06_JTextField() {
		
		
		JTextField input01;
		input01 = new JTextField("이곳에 입력하세요");
		JLabel label01;
		label01 = new JLabel();
		
		input01.setBounds(20, 20, 200, 30);
		label01.setBounds(20, 100, 300, 300);
		
		// KeyAdapter : KeyListener 를 전부 구현 하지 않도록 추상클래스로 바꿔놓은 클래스
		input01.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("input key released!");
				
				System.out.println("keyChar : " + e.getKeyChar());
				System.out.println("keyCode : " + e.getKeyCode());
				
				switch (e.getKeyCode()) {
				case 38:
					label01.setText(label01.getText() + '↑');
					break;
				case 40:
					label01.setText(label01.getText() + '↓');
					break;
				case 37:
					label01.setText(label01.getText() + '←');
					break;
				case 39:
					label01.setText(label01.getText() + '→');
					break;
				}
				
			}
		});
		
//		input01.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				//System.out.println("input01 key typed");
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				System.out.println("input01 key pressed! (오래누르고있는중)");
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				System.out.println("input01 key released! (키에서 손을 땜)");
//				
//			}
//		});
		
//		input01.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("방금 입력한 값 : " + e.getActionCommand());
//				input01.setText("");
//				
//			}
//		});
		
		add(input01);
		add(label01);
		
		// setVisible 시점에 우리에게 보이는 화면을 그림
		SwingTools.initTestFrame(this);
		
	}
	
	public static void main(String[] args) {
		
		new S06_JTextField();
		
	}
	
}
