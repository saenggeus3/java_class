package swing;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;




public class KakaoButton extends JButton{

	final static int image_cols = 6;
	final static int image_rows = 2;
	static BufferedImage source = null;
	
	static {
		try {
			source = ImageIO.read(
					new File("D:\\asset\\kakao1.png")
			);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public KakaoButton(KakaoBtnEnum name) {
		
			
		int btn_width = source.getWidth() / image_cols;
		int btn_height = source.getHeight() /image_rows;
		
		for (int col = 0; col < image_cols; col++) {
			for (int row = 0; row < image_rows; row++) {
				Image cropped_image = source.getSubimage(col*btn_width, row*btn_height, btn_width, btn_height);
				
				JButton btn = new JButton();
				
			
				
				btn.setSize(btn_width, btn_height);
				btn.setLocation(col*btn_width, row*btn_height);
				btn.setIcon(new ImageIcon(cropped_image.getScaledInstance(
						btn_width, btn_height, Image.SCALE_SMOOTH))
				);
				
			
				
			}
		}
		
		
		
		
	}
	

	
	
	
}
