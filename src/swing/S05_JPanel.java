package swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import swing.btn.actions.NextCardBtnAction;

public class S05_JPanel extends JFrame {
	
	ArrayList<JButton> btns = new ArrayList<>(25);
	
	{
		for (int i = 0; i < 10; i++) {
			btns.add(new JButton("button" + i));
		}
	}
	
	public S05_JPanel() {
		SwingTools.initTestFrame(this);
		
		
		// JPanel
		// 프레임 위에 추가로 붙일 수 있는 컨테이너
		// 컨테이너 역할을 하는 컴포넌트
		JPanel south_panel = new JPanel(new FlowLayout(FlowLayout.CENTER,0 ,0));
		JPanel center_panel = new JPanel(new CardLayout(10, 10));
		
		// MVC 패턴
		// M : Model
		//	데이터를 꺼내거나 저장할 때 사용하는 클래스, 데이터의 형태를 정의하는 클래스
		// V : View
		//	사용자에게 제공할 화면을 구성하는 클래스
		// C : Controller
		//	사용자의 입력을 처리하는데 필요한 클래스들을 따로 지칭하는말
		//	(1) 비즈니스 로직 - 비즈니스마다 달라지는 처리들을 비즈니스로직이라고 함
		//	(2) DAO(Data Access Object) - 데이터베이스(또는 파일 시스템)의 데이터에 접근하는 기능들
		
		// 사용자 -> View -> Controller -> Model -> 데이터베이스
		
		// MVC패턴을 분활해놓지 않았을 때 생기는 문제점
		
		/*
			1. lastAction, firstAction, prevAction (익명메서드들) 등이 컨트롤러로 분류
			2. 현재 소스는 화면을 표현하는 코드(View)와 로직을 담당하는 코드(Controller)가 혼재하고 있음
			3. 만약 여러 화면에 lastAction과 기능이 똑같은 버튼을 추가하는데
				Controller에 해당하는 익면 구현체가 분활되어있지 않다면 복사붙여넣기를 계속해야함
			4. 붙여놓은 같은 코드들이 여러군대 존재하게 되므로 코드 수정시에 문제가 발생함
		*/
		
		JButton next_btn = new JButton("next");
		next_btn.addActionListener(new NextCardBtnAction(center_panel));
		
		JButton first_btn = new JButton("first");
		first_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).first(center_panel);
				
			}
		});
		
		JButton last_btn = new JButton("last");
		last_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).last(center_panel);
				
			}
		});
		
		JButton prev_btn = new JButton("prev");
		prev_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				((CardLayout) center_panel.getLayout()).previous(center_panel);
				
			}
		});
		
		//1. center_panel에 이미지를 몇장 더 추가해보세요
		//2. south_panel에 first, last, prev 버튼을 추가해보세요
		
		this.setLayout(new BorderLayout(0, 0));
		this.add(center_panel, BorderLayout.CENTER);
		this.add(south_panel, BorderLayout.SOUTH);
		
		center_panel.add("apple", new JLabel(new ImageIcon("D:\\자바SW개발자 양성과정 10월 탁성강\\image\\apple.jpg")));
		center_panel.add("banana", new JLabel(new ImageIcon("D:\\자바SW개발자 양성과정 10월 탁성강\\image\\banana.jpg")));
		center_panel.add("kiwi", new JLabel(new ImageIcon("D:\\자바SW개발자 양성과정 10월 탁성강\\image\\kiwifruit.jpg")));
		center_panel.add("strawberry", new JLabel(new ImageIcon("D:\\자바SW개발자 양성과정 10월 탁성강\\image\\strawberry.jpg")));
		center_panel.add("watermelon", new JLabel(new ImageIcon("D:\\자바SW개발자 양성과정 10월 탁성강\\image\\watermelon.jpg")));
		
		south_panel.add(next_btn);
		south_panel.add(first_btn);
		south_panel.add(last_btn);
		south_panel.add(prev_btn);
	
	}
	
	
	
	public static void main(String[] args) {
		new S05_JPanel();
	}

}
