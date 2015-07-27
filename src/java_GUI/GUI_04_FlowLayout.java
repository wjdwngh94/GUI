package java_GUI;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Toolkit;

class MyFrame_04 extends Frame{	
	
	private Button bt1 = new Button("button1");
	private Button bt2 = new Button("button2");
	private Button bt3 = new Button("button3");
	private Button bt4 = new Button("button4");
	
	//FlowLayout : 물이 퍼지는 형상의 화면 분할 법
	
	private FlowLayout flow = new FlowLayout(FlowLayout.CENTER); //(정렬 상태값)
	public MyFrame_04(){
		
		//FlowLayout은 컨퍼런트가 아님으로 레이아웃 설정이 필요하다.
		this.setLayout(flow);

		//컨퍼런트는 add로 추가한다(창에 얹는다)
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
		//크기설정
		this.setSize(400, 300); 
		
		//화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		
		//( 화면 중심 - 창의 중심 )의 반
		int xpos = di.width/2 - this.WIDTH/2;
		int ypos = di.height/2 - this.getHeight()/2;
		
		System.out.println(di);

		//위치
		this.setLocation(xpos, ypos); 
		
		// 크기 고정 - false로 설정한다.
		this.setResizable(false); 
		
		//부모의 것들을 보이도록 설정
		this.setVisible(true);
		
	}
}

public class GUI_04_FlowLayout
{
	
	public static void main(String[] args) {
		//MyFrame_04 의 객체만 생성
		MyFrame_04 mf = new MyFrame_04(); 
		
	}
}
