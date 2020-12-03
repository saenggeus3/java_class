package swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class S08_JPopupMenu {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		JPopupMenu popup = new JPopupMenu("Edit");
		JMenuItem copy = new JMenuItem("����");
		JMenuItem cut = new JMenuItem("�߶󳻱�");
		JMenuItem  paste = new JMenuItem("�ٿ��ֱ�");
		
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("����");
				
			}
		});
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�߶󳻱�");
				
			}
		});
		
		popup.add(copy);
		popup.add(cut);
		popup.add(paste);
		
		
		// Ű���� �̺�Ʈ ó�� (KeyListener, KeyAdapter)
		// ���콺 �̺�Ʈ ó�� (MouseListener, MouseAdapter)
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//��� ���콺 ��ư�� ���ȴ��� üũ
				
				if(e.getButton() == MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					//System.out.printf("(%d, %d) ����\n",x ,y);
					popup.show(f, x, y);
				}
				
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(1000, 100);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

}