package control_statement;

public class Switch_01 {

	public static void main(String[] args) {

		//switch문
		/*
		 * if문과 유사하지만 if문은 인자값으로 true, false로 결정되는
		 * 조건식이 들어가야 하고, switch문은 인자값으로 조건이 아닌
		 * 비교값이 들어가야 한다.
		 */
			
		int num=1;
		
		switch (num) {
		case 1:
			System.out.println("1.게임시작");
			// break;
		case 2:
			System.out.println("2.게임옵션");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("3.종료");
			break;

		default:
			System.out.println("올바른 메뉴를 선택하세요");
			break;
		}
		
        String str = "bread";
        
        switch (Enum.compare(str)) {
               case APPLE:
                      System.out.println("apple");
                      break;
               case BANANA:
                      System.out.println("banana");
                      break;
               case BREAD:
                      System.out.println("bread");
                      break;
               default:
                      System.out.println("novalue");
        }
		
	}

	
    public enum Enum {
        APPLE, BANANA, BREAD, NOVALUE;
    
    	public static Enum compare(String str) {
               try {
                      return valueOf(str.toUpperCase());
               } catch (Exception ex) {
                      return NOVALUE;
               }
        }
 }
    
}
