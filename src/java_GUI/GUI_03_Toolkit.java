package java_GUI;


//JAVA GUI 이용법 종류

//java.awt 패키지 - 기본적으로 필요한 내용 old
//							운영체제에 종속적(운영체제 지원이 되지않으면 깨진다.)

//javax.swing 패키지 - aut기반으로한 확장 팩
// 								운영체제에 독립적으로 항시 같은 모양을 유지한다.(java특징에 부합)
//								구현하기 위해서 필요한 용량이 많다. - 무겁다

//javax.swt 패키지 - eclipse를 만들기 위해 만든 패키지
//		   					가볍지만 운영체제에 종속적이므로 운영체제별로 다른 버전이 존재한다.

//javafx 			애니메이션 구현이 쉽지만 api가 부족하고  java에 대한 이해가 필요하다.

//창을 만드는 기본적인 방법
//시작 지점 / 높이 / 폭  -> Frame  
//창을 만든다는 것은 frame의 객체를 만드는 것이다.
//하지만 protected로 묶인 부분이 많기 때문에
//자식 class를 만들어 상속을 통해 확장시켜 나간다.



//창을 한번 만들어 보자...
//frame클래스를 상속바당 확장

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame; //frame의 정보를 가지고 있는 package
import java.awt.Toolkit;

class MyFrame_03 extends Frame{	//frame을 상속받아 하나의 Frame이 되었다.
	//필요한 항목들은 멤버 변수로 정의
	private Button bt1 = new Button("button1");
	private Button bt2 = new Button("button2");
	
	/*
	 * 
	 * 분할법 - Layout
	 * 1.FlowLayout 물방울 떨어 뜨리듯이 분할 , 떨어뜨린 자리를 기준으로 옆으로 퍼진다
	 * 		= left, center, right   숫자가 늘어날수록 기준점을 기준으로 퍼진다.
	 * 
	 * 2.GridLayout - 격자 분할법(excel표와 같다)
	 * 		= 줄, 칸   2, 3 -> 6등분, 크기 동일
	 * 	1 2 3		좌상단 부터
	 *  4 5 6		우하단 까지
	 *  
	 *  3.BorderLayout
	 *  	= 중심, 동, 서 , 남, 북  방향을 통해서 레이아웃 설정
	 *  	= 중앙이 기본값이다.
	 *  	= 
	 */
	
	
	
	//생성자에 기본적인 설정(초기화) 내용을 정의
	public MyFrame_03(){
		
		this.add(bt1);
		this.add(bt2);
		
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

public class GUI_03_Toolkit
{
	public static void main(String[] args) {
		//MyFrame_03 의 객체만 생성
		MyFrame_03 mf = new MyFrame_03(); 
		
	}
}
