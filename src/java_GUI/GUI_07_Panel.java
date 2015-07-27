package java_GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;

class MyFrame_07 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.
	
	//필요한 항목들은 멤버 변수로 정의
	
	//레이아웃 2개
	private BorderLayout border = new BorderLayout();
	private GridLayout grid = new GridLayout(2,1);
	
	//컴포넌트 2개
	private Button bt1 = new Button("in");
	private Button bt2 = new Button("out");
	
	//panel : frame 처럼 레이아웃 설정이 가능한 투명한 공간
	private Panel panel = new Panel();
	
	public void init(){
		this.setLayout(border); // new BorderLayout();
		
		this.add(panel , BorderLayout.EAST);
		panel.setBackground(Color.red);
		panel.setLayout(grid);
		panel.add(bt1);
		panel.add(bt2);
	}
	//생성자에 기본적인 설정(초기화) 내용을 정의
	public MyFrame_07(){
		
		init();
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
		//크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다
		
		//화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		
		//( 화면 중심 - 창의 중심 )의 반
		int xpos = di.width/2 - this.WIDTH/2;
		int ypos = di.height/2 - this.getHeight()/2;
		
		System.out.println(di); // []안의 내용이 객체가 가져오는 내용이다.
		
		//위치
		this.setLocation(xpos, ypos); 
		
		// 크기 고정 - false로 설정한다.
		this.setResizable(false); 
		
		//부모의 것들을 보이도록 설정
		this.setVisible(true);
		
	}
}

public class GUI_07_Panel
{
	public static void main(String[] args) {
		//MyFrame_07 의 객체만 생성
		MyFrame_07 mf = new MyFrame_07(); 
		
	}
}
