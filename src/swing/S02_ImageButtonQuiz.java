package swing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_ImageButtonQuiz extends JFrame {
	
	ArrayList<JButton> btns;
	final static int image_cols = 6;
	final static int image_rows = 2;
	
	public S02_ImageButtonQuiz() {
		btns = new ArrayList<JButton>(12);
		try {
			BufferedImage source = ImageIO.read(
					new File("D:\\asset\\kakao1.png")
			);
			
			
			
			
			System.out.println("�̹��� ��ü �ʺ� : " + source.getWidth());
			System.out.println("�̹��� ��ü ���� : " + source.getHeight());
			
			System.out.println("�� �̹��� �ʺ� " + source.getWidth() / image_cols);
			System.out.println("�� �̹��� ���� " + source.getHeight() /image_rows);
			
			int btn_width = source.getWidth() / image_cols;
			int btn_height = source.getHeight() /image_rows;
			
			for (int col = 0; col < image_cols; col++) {
				for (int row = 0; row < image_rows; row++) {
					Image cropped_image = source.getSubimage(col*btn_width, row*btn_height, btn_width, btn_height);
					
					JButton btn = new JButton();
					
					int randomSize = (int)(Math.random()*31 + 50);
					int random_x = (int)(Math.random()*(1000-randomSize));
					int random_y = (int)(Math.random()*(1000-randomSize));
					
					btn.setSize(randomSize, randomSize);
					btn.setLocation(col*btn_width, row*btn_height);
					//getScaledInstance�� �̹��� ũ�� ������ ����
					btn.setIcon(new ImageIcon(cropped_image.getScaledInstance(
							randomSize, randomSize, Image.SCALE_SMOOTH))
					);
					
				
					btns.add(btn);
					
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(JButton btn : btns) {
			add(btn);
		}
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(1350, 100);
		setSize(1000,1000);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		new S02_ImageButtonQuiz();
		
	}

}