package swing;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public enum PictureEnum {
	
	APPLE("사과", "D:\\자바SW개발자 양성과정 10월 탁성강\\image\\apple.jpg"),
	BANANA("바나나", "D:\\자바SW개발자 양성과정 10월 탁성강\\image\\banana.jpg"),
	KIWI("바나나", "D:\\자바SW개발자 양성과정 10월 탁성강\\image\\kiwifruit.jpg"),
	STRAWBERRY("바나나", "D:\\자바SW개발자 양성과정 10월 탁성강\\image\\strawberry.jpg"),
	WATERMELON("바나나", "D:\\자바SW개발자 양성과정 10월 탁성강\\image\\watermelon.jpg");

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
