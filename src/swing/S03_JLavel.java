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
			"D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\apple.jpg",
			"D:\\�ڹ�SW������ �缺���� 10�� Ź����\\image\\banana.jpg"};

	// ArrayList�� �̸� ImageIcon�� ����� ����
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
	
	// �������� : ��ư�� �ϳ� �߰��ϰ�, �� ��ư�� ������ ��� �׸��� �ٳ����� ���ϵ��� �������� (�ٽô����� ����ιٲ�)
	
	public S03_JLavel() throws IOException {
		
		// JLabel : �ؽ�Ʈ, �׸����� ���� �� �ִ� ������Ʈ
		JLabel label01 = new JLabel("Hello, java gui!!");
		
		
		// ������Ʈ���� �۲� ����
		label01.setFont(new Font("�ü�ü", Font.ITALIC, 20));
		
		JLabel label02 = new JLabel(images.get(curr_image));
		
		JButton button01 = new JButton("�̹��� ����");
		
		label01.setBounds(50, 50, 400, 50);
		label02.setBounds(50, 120, 100, 100);
		
		// �󺧿� �׵θ� �߰�
		label02.setBorder(BorderFactory.createLineBorder(Color.black, 1, false));
		button01.setBounds(50, 250, 100, 50);
		button01.setText("�̹�����ȯ");
		
		
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
