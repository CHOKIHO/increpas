package frame;

import java.awt.Frame;

public class FrameEx2 extends Frame {

	
	public FrameEx2() {
		super("프레임 테스트");
		this.setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		FrameEx2 fe = new FrameEx2();

	}

}
