package class01;

public class Seoul {

	public static void main(String[] args) {

		Computer com1 = new Computer();
		com1.color="white";
		com1.cpu=3.0f;
		com1.ram=2;
		com1.hdd=200;
		
		com1.getInfo();
		
		System.out.println("-----------------");
		
		Computer com2 = new Computer();
		com2.color="black";
		com2.cpu=2.4f;
		com2.ram=256;
		com2.hdd=100;
		com2.getInfo();
		
	}

}
