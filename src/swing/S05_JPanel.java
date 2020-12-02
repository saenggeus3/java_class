package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing.btn.actions.NextCardBtnAction;

public class S05_JPanel extends JFrame {
	
	ArrayList<JButton> btns = new ArrayList<>(25);
	
	{
		for (int i = 0; i < 10; i++) {
			btns.add(new JButton("button" + i));
		}
	}
	
	public S05_JPanel() {
		SwingTools.initTestFrame(this);
		
		
		// JPanel
		// ������ ���� �߰��� ���� �� �ִ� �����̳�
		// �����̳� ������ �ϴ� ������Ʈ
		JPanel south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER,0 ,0));
		JPanel center_panel = new JPanel(new CardLayout(10, 10));
		
		// MVC ����
		// M : Model
		//	�����͸� �����ų� ������ �� ����ϴ� Ŭ����, �������� ���¸� �����ϴ� Ŭ����
		// V : View
		//	����ڿ��� ������ ȭ���� �����ϴ� Ŭ����
		// C : Controller
		//	������� �Է��� ó���ϴµ� �ʿ��� Ŭ�������� ���� ��Ī�ϴ¸�
		//	(1) ����Ͻ� ���� - ����Ͻ����� �޶����� ó������ ����Ͻ������̶�� ��
		//	(2) DAO(Data Access Object) - �����ͺ��̽�(�Ǵ� ���� �ý���)�� �����Ϳ� �����ϴ� ��ɵ�
		
		// ����� -> View -> Controller -> Model -> �����ͺ��̽�
		
		// MVC������ ��Ȱ�س��� �ʾ��� �� ����� ������
		
		/*
			1. lastAction, firstAction, prevAction (�͸�޼����) ���� ��Ʈ�ѷ��� �з�
			2. ���� �ҽ��� ȭ���� ǥ���ϴ� �ڵ�(View)�� ������ ����ϴ� �ڵ�(Controller)�� ȥ���ϰ� ����
			3. ���� ���� ȭ�鿡 lastAction�� ����� �Ȱ��� ��ư�� �߰��ϴµ�
				Controller�� �ش��ϴ� �͸� ����ü�� ��Ȱ�Ǿ����� �ʴٸ� ����ٿ��ֱ⸦ ����ؾ���
			4. �ٿ����� ���� �ڵ���� �������� �����ϰ� �ǹǷ� �ڵ� �����ÿ� ������ �߻���
		*/
		
		JButton next_btn = new JButton("next");
		next_btn.addActionListener(new NextCardBtnAction(center_panel));
		
		JButton first_btn = new JButton("first");
		first_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).first(center_panel);
				
			}
		});
		
		JButton last_btn = new JButton("last");
		last_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).last(center_panel);
				
			}
		});
		
		JButton prev_btn = new JButton("prev");
		prev_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).previous(center_panel);
				
			}
		});
		
		//1. center_panel�� �̹����� ���� �� �߰��غ�����
		//2. south_panel�� first, last, prev ��ư�� �߰��غ�����
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);
		
		center_panel.add("apple", new JLabel(new ImageIcon("D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\apple.jpg")));
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\banana.jpg")));
		center_panel.add("kiwi", new JLabel(new ImageIcon("D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\kiwifruit.jpg")));
		center_panel.add("strawberry", new JLabel(new ImageIcon("D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\strawberry.jpg")));
		center_panel.add("watermelon", new JLabel(new ImageIcon("D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\watermelon.jpg")));
		
		south_panel.add(next_btn);
		south_panel.add(first_btn);
		south_panel.add(last_btn);
		south_panel.add(prev_btn);
	
	}
	
	
	
	public static void main(String[] args) {
		new S05_JPanel();
	}

}
