package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JIconquiz extends JFrame {

	public JIconquiz() {
		
		JButton[] buttonList = new JButton[12];
//		JButton button3 = new JButton(new ImageIcon("D:\\asset\\icon"+j+".png"));
//		button3.setBounds(20, 100, 109, 110);
//		add(button3);
		
		for (int i = 1; i < 13; i++) {
			for (int j = 1; j < 2; j++) {
				buttonList[i-1] = new JButton(new ImageIcon("D:\\asset\\icon"+i+".png"));
				buttonList[i-1].setBounds(i*130-110, j*130+600, 109, 110);
				
				add(buttonList[i-1]);
			}
			
		}  
		
		
		
		ActionListener basic_btn_action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1350, 100);
		setSize(1600, 900);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JIconquiz();
	}
	
	
}
