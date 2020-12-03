package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;





public class S08_PopupMenuQuiz extends JFrame {
	
	final static String[] paths = {
			"image\\주사위1.png",
			"image\\주사위2.png",
			"image\\주사위3.png",
			"image\\주사위4.png",
			"image\\주사위5.png",
			"image\\주사위6.png"};

	final static ArrayList<ImageIcon> images = new ArrayList<>();
	
	static {
		for(String path : paths) {
			setImageIcon(path);
		}
	}
	
	private static void setImageIcon(String path) {
		try {
			images.add(new ImageIcon(ImageIO.read(new File(path))
					.getScaledInstance(100, 100, Image.SCALE_FAST)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	int dice1_ran = (int)(Math.random()*6);
	int dice2_ran = (int)(Math.random()*6);
	int dice3_ran = (int)(Math.random()*6);
	int dice4_ran = (int)(Math.random()*6);
	int dice5_ran = (int)(Math.random()*6);
	
	// 화면에 5개의 주사위를 띄우고
	// 팝업메뉴, 메뉴바 버튼에 REROLL기능을 달아보세요
	
	// 어느곳에 있는 REROLL을 누르던 간에 주사위가 변해야함
	
	public S08_PopupMenuQuiz() {
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem REROLL;
		
		REROLL = new JMenuItem("REROLL");
		
		JPopupMenu popup = new JPopupMenu("Edit");
		JMenuItem pop_reroll = new JMenuItem("REROLL");
		
		popup.add(pop_reroll);
		
		
		
		
		menu.add(REROLL);
		bar.add(menu);
		this.setJMenuBar(bar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 250);
		setSize(500, 500);
		setLayout(new BorderLayout());
		setVisible(true);
		
		
		
		JPanel center_panel = new JPanel();
		JLabel dice1 = new JLabel(images.get(dice1_ran));
		JLabel dice2 = new JLabel(images.get(dice2_ran));
		JLabel dice3 = new JLabel(images.get(dice3_ran));
		JLabel dice4 = new JLabel(images.get(dice4_ran));
		JLabel dice5 = new JLabel(images.get(dice5_ran));
		center_panel.setLayout(new GridLayout(2, 3));
		
		
		
		center_panel.add(dice1);
		center_panel.add(dice2);
		center_panel.add(dice3);
		center_panel.add(dice4);
		center_panel.add(dice5);		
		add(center_panel);
		
		REROLL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1_ran = (int)(Math.random()*6);
				dice2_ran = (int)(Math.random()*6);
				dice3_ran = (int)(Math.random()*6);
				dice4_ran = (int)(Math.random()*6);
				dice5_ran = (int)(Math.random()*6);
				
				dice1.setIcon(images.get(dice1_ran));
				dice2.setIcon(images.get(dice2_ran));
				dice3.setIcon(images.get(dice3_ran));
				dice4.setIcon(images.get(dice4_ran));
				dice5.setIcon(images.get(dice5_ran));
			}
		});
		
		pop_reroll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dice1_ran = (int)(Math.random()*6);
				dice2_ran = (int)(Math.random()*6);
				dice3_ran = (int)(Math.random()*6);
				dice4_ran = (int)(Math.random()*6);
				dice5_ran = (int)(Math.random()*6);
				
				dice1.setIcon(images.get(dice1_ran));
				dice2.setIcon(images.get(dice2_ran));
				dice3.setIcon(images.get(dice3_ran));
				dice4.setIcon(images.get(dice4_ran));
				dice5.setIcon(images.get(dice5_ran));
				
			}
		});
		
		center_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(e.getButton() == MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					popup.show(center_panel, x, y);
				}
				
			}
		});
		
	}
	

	public static void main(String[] args) {
		
		new S08_PopupMenuQuiz();
		
	}

}
