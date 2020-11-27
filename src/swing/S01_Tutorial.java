package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_Tutorial {
	
	public static void main(String[] args) {
		
		// Swing
		// JAVA�� ������ ���α׷��� ���� �� �ִ� API
		
		// JFrame 
		// �پ��� ������Ʈ���� �߰��� �� �ִ� �����̳� �� �ϳ�
		
		// �����̳�
		//	������Ʈ�� �߰��ϴ� ��
		//	JFrame, JPanel, JDialog ...��
		//	�����̳� ���� ���̾ƿ��� ������ �� ����
		
		// ������Ʈ
		//	�����̳ʿ� �߰��ϴ� ��ǰ��
		//	JButton, JTable, JSlider, JMenu ...��
		
		// JButton
		//	��ư ������Ʈ ������ ������
		
		JFrame frame = new JFrame("����!");
		//JButton b = new JButton("CLICK!");
		JButton b = new KakaoButton_an(KakaoBtnEnum.DIARY);
		b.setLocation(100,100);
		//b.setSize(150);
		
		b.setBounds(100, 100, 120, 120);
		frame.add(b);
		
		// frame�� �⺻������ �����Ǿ��ִ� ���̾ƿ��� ������
		frame.setLayout(null);
		
		// �ش� �������� X��ư�� ������ ���� ������ ������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ũ�� ����
		frame.setSize(500, 500);
		
		// �������� ���̰� ����(ȭ�鿡 �׸�)
		// GUIȯ�濡���� ȭ�鿡 ��ȭ�� ������� ���� ���� ȭ���� �ٽ� �׷��� ��
		frame.setVisible(true);
		
	}

}
