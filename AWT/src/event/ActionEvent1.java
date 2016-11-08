package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ActionEvent1 extends Frame {

	Button button;

	public ActionEvent1(String title) {
		super(title);
		button = new Button("OK");
		add(button);

		// 액션리스너 객체를 만든다.
		// ActionListener ac = new ActionHandler();
		// button.addActionListener(ac);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());

			}
		});
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("윈도우 닫기");
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		}); 

	}

	public static void main(String[] args) {
		ActionEvent1 me = new ActionEvent1("액션이벤트처리");
		me.pack();
		me.setVisible(true);

	}

}
