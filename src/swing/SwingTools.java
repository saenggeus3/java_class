package swing;

import javax.swing.JFrame;

public class SwingTools {
	
	public static void initTestFrame(JFrame frame) {
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(1200, 100);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
