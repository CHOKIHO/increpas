package overload;

public class OverloadMain {

	public static void main(String[] args) {

		Ex_Overloading ol = new Ex_Overloading();

		ol.getResult();
		ol.getResult(100);
		ol.getResult('A');
		ol.getResult("hello");
		ol.getResult("java", 5);		
		ol.getResult(5,	"java");
		
	}
	
	

}
