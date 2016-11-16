package extends02;

public class Cat extends Animal {

	String balence = "균형감각";

	public String getBalence() {
		return balence;
	}

	public void setBalence(String balence) {
		this.balence = balence;
	}

	// 오버라이딩
	/*
	 * '메서드 재정의'
	 * 상속관계의 객체관계에서 부모와 함수를 가져와
	 * 자식에 맞게 재정의하는것
	 * 
	 */
	@Override
	public int getLeg() {
		return 4;
	}
	
}
