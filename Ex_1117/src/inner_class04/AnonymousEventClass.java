package inner_class04;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousEventClass {
	
	static int count =0;
	public static void main(String[] args) {
		
		//익명내부클래스 --------> 메서드내에서 클래스를 생성
		/*
		 * 익명클래스 생성시 파라메터로 인터페이스를 구현해야할때 사용
		 * 외형은 메서드이기 때문에 쎄미콜론(;)으로 끝나야 한다.
		 * 
		 * 익명내부클래스를 사용하면
		 * 이벤트리스너 등록과 동시에 실행할 메서드를 오버라이드할수 있음
		 */
		
		Frame f = new Frame();
		Button btn = new Button("Function");
		
		f.setSize(30,  300);
		f.add(btn);
		f.setVisible(true);
		
		//익명 내부클래스 (버튼 이벤트처리에 자주사용)
		//버튼클릭이벤트추가 (ActionListener 인터페이스가 필요하다)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//btn.setLabel(""+count++);
				System.exit(0);
			}
		});
		
	}
}
