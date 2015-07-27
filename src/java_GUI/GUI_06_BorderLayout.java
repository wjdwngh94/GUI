package java_GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Toolkit;

import javax.swing.border.Border;

class MyFrame_06 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.
	
	
	private Button bt1 = new Button("button1");
	private Button bt2 = new Button("button2");
	private Button bt3 = new Button("button3");
	private Button bt4 = new Button("button4");
	private Button bt5 = new Button("button5");

	//Border Layout : 방향으로 화면을 분할한다.
	private BorderLayout border = new BorderLayout(20, 10);
	//x, y 간격
	
	public void init(){
		
		this.setLayout(border);
		
		//방향을 지정해 가면서 배치하여야 한다.
		this.add(bt1, BorderLayout.NORTH);
		this.add(bt2, BorderLayout.SOUTH);
		this.add(bt3, BorderLayout.WEST);
		this.add(bt4, BorderLayout.EAST);
		this.add(bt5, BorderLayout.CENTER); // 기본 값
	}
	public MyFrame_06(){
		
		init(); // init 호출
		
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

public class GUI_06_BorderLayout
{
	public static void main(String[] args) {
		//MyFrame_06 의 객체만 생성
		MyFrame_06 mf = new MyFrame_06(); 
		
	}
}
