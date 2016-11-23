package object_stream;

import java.io.Serializable;

public class RspInfo implements Serializable {
	//현재 클래스는 승, 무, 패, 아이디를 기록
	/*
	 * 현재 클래스의 멤버변수는 메모리에 순차적으로 저장되어 있지 않음
	 * 이구조를 일렬로 만들어서 복사해 주는 작업이 serializable(객체직렬화)
	 * 
	 */


	private int win;
	private int lose;
	private int draw;
	private String name;

	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
