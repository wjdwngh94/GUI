package java_GUI;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;

class MyFrame_08 extends Frame{
	private static final Object GridLayout = null;

	//필요한 항목들은 멤버 변수로 정의
	
		//레이아웃 2개
		//private BorderLayout border = new BorderLayout();
		private GridLayout grid = new GridLayout(4,3);
		
		private Label lb = new Label("Telephone", Label.CENTER);
		//컴포넌트 2개
		
		//배열 생성
		//자료형[] 배열명 = new 자료형 [공간개수];
		private Button[] bt = new Button[12];
		
		//제목 배열
		private String[] title = new String[]{
			//	new String("1");
			"1","2","3","4","5","6","7","8","9","*","0","#"	
		};
		
		/*
		private Button bt1 = new Button("1");
		private Button bt2 = new Button("2");
		private Button bt3 = new Button("3");
		private Button bt4 = new Button("4");
		private Button bt5 = new Button("5");
		private Button bt6 = new Button("6");
		private Button bt7 = new Button("7");
		private Button bt8 = new Button("8");
		private Button bt9 = new Button("9");
		private Button bt_st = new Button("*");
		private Button bt0 = new Button("0");
		private Button bt_sh = new Button("#");
		*/
		
		//panel : frame 처럼 레이아웃 설정이 가능한 투명한 공간
		private Panel panel = new Panel();
		
		//글꼴 생성 : Font 클래스의 객체 생성
		private Font font = new Font("", Font.BOLD, 30); //("글꼴", 형태, 크기);
		
		//색상 생성 : Color 클래스의 객체 생성
		private Color color = new Color(205, 247, 193); // RGB
		
		//커서 생성 : Cursor 클래스의 객체 생성
		private Cursor cursor = new Cursor(Cursor.HAND_CURSOR); //(정수 모양 값)
		
		public void init(){
			
			//this.setLayout(border); // new BorderLayout();
			this.add(lb, BorderLayout.NORTH);
			this.add(panel , BorderLayout.CENTER);

			
			this.add(panel , GridLayout);
			panel.setLayout(grid);
			
			//라벨의 글꼴을 font로 설정
			lb.setFont(font);
			
			//라벨의 배경을 color로 설정
			lb.setBackground(color);
			
			
			for (int i = 0; i < bt.length; i++) {
				bt[i] = new Button(title[i]); // 버튼 생성
				
				//폰트 설정하기
				bt[i].setFont(new Font("", Font.ITALIC, 25)); //객체로 사용하지 않고 일회용으로
				
				//배경과 글자색 설정하기
				bt[i].setBackground(Color.BLACK);	// 상수 객체 - 배경
				bt[i].setForeground(Color.WHITE); // 상수객체 -글자
				
				//bt[i]에 커서 모양 적용하기
				bt[i].setCursor(cursor);
				
				panel.add(bt[i]);
			}
			
			/*
			panel.add(bt1);
			panel.add(bt2);
			panel.add(bt3);
			panel.add(bt4);
			panel.add(bt5);
			panel.add(bt6);
			panel.add(bt7);
			panel.add(bt8);
			panel.add(bt9);
			panel.add(bt_st);
			panel.add(bt0);
			panel.add(bt_sh);
			*/
		}
		
	public MyFrame_08(){
		
		init();
		//화면의 제목 설정
		this.setTitle("AWT 실습");
		
		
		//크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다
		
		//화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		//Toolkit = GUI에서 사용하는 도구클래스
		//도구클래스에서 기본클래스를 가져와서 사이즈 계산하는 클래스 가져온다
		//dimension으로 포장해서 가져온다.
		
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

public class GUI_08_PHONE
{
	public static void main(String[] args) {
		//MyFrame_08 의 객체만 생성
		MyFrame_08 mf = new MyFrame_08(); 
		
	}
}
