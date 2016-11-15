package construct02;

public class Note {

	private int page;
	private int price;
	private String color;
	
	public Note() {
	}

	//생성자 오버로딩 (기본생성자도 반드시 작성)
	public Note(int page, int price, String color) {
		this.page = page;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {

		System.out.println(this.page + " " + this.price + " " + this.color);
		return super.toString();
	}
}
