package swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum PictureEnum {
	
	APPLE("���", "D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\apple.jpg"),
	BANANA("�ٳ���", "D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\banana.jpg"),
	KIWI("�ٳ���", "D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\kiwifruit.jpg"),
	STRAWBERRY("�ٳ���", "D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\strawberry.jpg"),
	WATERMELON("�ٳ���", "D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\watermelon.jpg");

	String kName;
	String img_path;
	Image image;
	
	PictureEnum(String kName, String img_path) {
		this.kName = kName;
		this.img_path = img_path;
		try {
			this.image = ImageIO.read(new File(img_path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
