package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex_ActionEvent extends Frame implements ActionListener {

	Panel p;
	Button input, exit;
	TextArea ta;
	
	public Ex_ActionEvent() {
		
		super("Action Event Test");
		p = new Panel();
		input = new Button("input");
		exit = new Button("exit");
		ta = new TextArea();
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		p.add(input);
		p.add(exit);
		
		add(p, BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		
		setBounds(300, 300, 300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex_ActionEvent ev = new Ex_ActionEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name;
		name = e.getActionCommand();
		
		if (name.equals("input")) 
			ta.append("버튼이 입력되었습니다.");
		else {
			ta.append("프로그램을 종료합니다.");
			
			try {
				Thread.sleep(2000);
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
