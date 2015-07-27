package java_GUI;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.GridLayout;
import java.awt.Toolkit;

class MyFrame_05 extends Frame { // frame을 상속받아 하나의 Frame이 되었다.

	// 필요한 항목들은 멤버 변수로 정의

	private Button bt1 = new Button("button1");
	private Button bt2 = new Button("button2");
	private Button bt3 = new Button("button3");
	private Button bt4 = new Button("button4");
	private Button bt5 = new Button("button5");
	private Button bt6 = new Button("button6");

	// GridLayout : 표의 형식으로 화면을 분할한다. - 줄, 칸

	private GridLayout gird = new GridLayout(2, 2);

	public void init(){
		//배치 내용 기재

		//this.setLayout(gird);
		this.setLayout(new GridLayout(2,2));

		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);

	}
	// 생성자에 기본적인 설정(초기화) 내용을 정의
	public MyFrame_05() {

		init();
		// 화면의 제목 설정
		this.setTitle("AWT 실습");

		// 크기설정
		this.setSize(400, 300); // 모니터 해상도에 따라서 다르다

		// 화면 중심 계산
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();

		// ( 화면 중심 - 창의 중심 )의 반
		int xpos = di.width / 2 - this.WIDTH / 2;
		int ypos = di.height / 2 - this.getHeight() / 2;

		System.out.println(di); // []안의 내용이 객체가 가져오는 내용이다.

		// 위치
		this.setLocation(xpos, ypos);

		// 크기 고정 - false로 설정한다.
		this.setResizable(false);

		// 부모의 것들을 보이도록 설정
		this.setVisible(true);

	}
}

public class GUI_05_ButtonLayout
{
	public static void main(String[] args) {
		// MyFrame_05 의 객체만 생성
		MyFrame_05 mf = new MyFrame_05();
		
	}
}
