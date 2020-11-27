package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_JButton extends JFrame {
	
	public S02_JButton() {
		JButton button1 = new JButton("����������!");
		JButton button2 = new JButton("CLICK ME!");
		JButton button3 = new JButton(new ImageIcon("D:\\�����߹���\\1582176614.gif"));
		
		// setBountds : ��ġ�� ũ�⼳��
		button1.setBounds(20, 100, 100, 50);
		button2.setBounds(20, 250, 100, 50);
		button3.setBounds(120, 50, 512, 512);
		
		// setText : ������Ʈ�� �ؽ�Ʈ�� ������
		button1.setText("ok");
		button2.setText("Ŭ��!");
		
		// setEnable : ��ư�� Ȱ��ȭ/��Ȱ��ȭ �Ѵ�
		button1.setEnabled(false);
		button2.setEnabled(true);
		
		// ��ư�� �⺻ ���� �׼� �����ʸ� ����
		ActionListener basic_btn_action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ���Ƚ��ϴ�.!");
				System.out.println("��ư ���� : " + e.getSource());
				JButton clicked_btn = (JButton)e.getSource();
				System.out.println(e.getActionCommand());
				
				System.out.println("��ư�� �̸� : " + clicked_btn.getText());
			}
		};
		
		// ��ư�� ������ �߰�
		//	ActionListener �������̽��� ����ü�� ��ư���� �߰�
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
