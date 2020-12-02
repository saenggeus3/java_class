package swing;

import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PictureLabel extends JLabel{
	

	public PictureLabel(PictureEnum picture) {
		super(new ImageIcon(picture.image
				.getScaledInstance(450, 400, Image.SCALE_AREA_AVERAGING)));
	}
	
}
