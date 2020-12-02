package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S03_JLavel extends JFrame{
	boolean image_check = true;	
	
	final static String[] paths = {
			"D:\\자바SW개발자 양성과정 10월 탁성강\\image\\apple.jpg",
			"D:\\자바SW개발자 양성과정 10월 탁성강\\image\\banana.jpg"};

	// ArrayList에 미리 ImageIcon을 만들어 놓음
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
	
	int curr_image = 0;
	
	// 연습문제 : 버튼을 하나 추가하고, 그 버튼을 누르면 사과 그림이 바나나로 변하도록 만들어보세요 (다시누르면 사과로바뀜)
	
	public S03_JLavel() throws IOException {
		
		// JLabel : 텍스트, 그림등을 적을 수 있는 컴포넌트
		JLabel label01 = new JLabel("Hello, java gui!!");
		
		
		// 컴포넌트들의 글꼴 설정
		label01.setFont(new Font("궁서체", Font.ITALIC, 20));
		
		JLabel label02 = new JLabel(images.get(curr_image));
		
		JButton button01 = new JButton("이미지 스왑");
		
		label01.setBounds(50, 50, 400, 50);
		label02.setBounds(50, 120, 100, 100);
		
		// 라벨에 테두리 추가
		label02.setBorder(BorderFactory.createLineBorder(Color.black, 1, false));
		button01.setBounds(50, 250, 100, 50);
		button01.setText("이미지변환");
		
		
		JFrame myframe = this;
		button01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label02.setIcon(images.get(++curr_image % images.size()));
				myframe.getContentPane().setBackground(Color.magenta);
				
			}
		});
		
		add(label01);
		add(label02);
		add(button01);
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(1200,100);
		setVisible(true);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		new S03_JLavel();
		
	}

}
