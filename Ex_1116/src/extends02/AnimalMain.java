package extends02;

public class AnimalMain {

	public static void main(String[] args) {

/*		Cat cat = new Cat();
		cat.shout="야옹";
		System.out.println(cat.shout);
		System.out.println(cat.balence);
		
		Bear bear = new Bear();
		bear.shout="크아앙";
		System.out.println(bear.shout);
		System.out.println(bear.woong);
		
		Animal ani1 = new Cat();
		((Cat)ani1).balence="0";
*/
		
		Cat cat = new Cat();
		cat.setShout("야옹");
		
		//cat.getLeg는 오버라이드 메서드임(Cat 클래스에서 재정의)
		System.out.println(cat.getLeg());
				
		Bear bear = new Bear();
		//bear.getLeg는 오버라이드 메서드임(Bear 클래스에서 재정의)
		System.out.println(bear.getLeg());
		
	}

}
