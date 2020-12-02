package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class S07_JMenu extends JFrame {
	
	
	
	
	public S07_JMenu() {
		
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenu sub_menu = new JMenu("µ¿¹°");
		JMenuItem i1, i2, i3, i4, i5;
		JMenuItem si1, si2, si3;
		
		i1 = new JMenuItem(PictureEnum.APPLE.kName);
		i2 = new JMenuItem("¹Ù³ª³ª");
		i3 = new JMenuItem("Å°À§");
		i4 = new JMenuItem("µþ±â");
		i5 = new JMenuItem("¼ö¹Ú");
		
		si1 = new JMenuItem("Æë±Ï");
		si2 = new JMenuItem("ÄÚ³¢¸®");
		si3 = new JMenuItem("»çÀÚ");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(i5);
		menu.add(sub_menu);
		
		sub_menu.add(si1);
		sub_menu.add(si2);
		sub_menu.add(si3);
		
		
		bar.add(menu);
		
		this.setJMenuBar(bar);
		SwingTools.initTestFrame(this);
		
		setLayout(new BorderLayout());
		JPanel center_panel = new JPanel();
		JLabel label01 = new JLabel("NO PICTURE");
		
		center_panel.setLayout(new CardLayout(20, 20));
		
		for(PictureEnum picname : PictureEnum.values()) {
			center_panel.add(picname.toString(), new PictureLabel(picname));
		}
		
		
		
		add(center_panel, BorderLayout.CENTER);
		add(label01, BorderLayout.SOUTH);
		
		
		setVisible(true);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new S07_JMenu();
		
	}

}
