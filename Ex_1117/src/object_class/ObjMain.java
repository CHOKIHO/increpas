package object_class;

public class ObjMain {

	public static void main(String[] args) {

		//setValue()는 인자로 Object타입을 요구하지만
		//String역시 Object의 자손이므로 대입가능 (하위타입 - 상위타입)
		
		ObjClass v1 = new ObjClass();
		
		v1.setValue("TEST");
				
		//casting이 필요하다. (큰타입이 작은타입으로 대입되기때문)
		String str = (String) v1.getValue();
		
		System.out.println(v1.getValue());
		
		ObjClass v2 = new ObjClass();
		
		//오토박싱 개념  (String은 클래스인데 객체로 대입)
		
		int num = 100;
		v2.setValue(num);      		// 기본자료형 -----> 자동으로 객체화시켜(Object) 대입 (AutoBoxing)
		
//		num = v2.getValue();   		// Object를 int(기본자료형)으로 대입불가
		
		num = (int)v2.getValue();  	// 객체 ----> 기본자료형으로 자동 캐스팅 (UnBoxing)
		System.out.println(num);
		
		num =(Integer)v2.getValue();
		System.out.println(num);
		
		

	}

}
