package java_GUI;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame; 
import java.awt.Label;
import java.awt.Toolkit;

class MyFrame_02 extends Frame{	
		
		//필요한 항목들은 멤버 변수로 정의
		
		//생성자를 이용해서 글쓰기
		private Label lb = new Label("i'm Label.", Label.CENTER);
		
		
		//private Label lb = new Label("i'm Label.", 0);
		//, 뒤는 0(왼) 1(중) 2(오) 위치
		
		public MyFrame_02(){
			
			//이미 만들어진 lb를 Frame(this)에 추가
			this.add(lb);
			
			//배경을 노란색으로
			//lb.setBackground(Color.yellow);
			
			
			//메소드를 이용해서 글쓰기
			//lb의 글자 설정
			//lb.setText("반갑습니다 AWT");
			
			//화면의 제목 설정
			this.setTitle("AWT 실습");
			
			
			//크기설정
			this.setSize(400, 300); 		
			
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


public class GUI_02_Label
{
	public static void main(String[] args) {
		
		//MyFrame_02 의 객체만 생성
		MyFrame_02 mf = new MyFrame_02(); 
		
	}
}
