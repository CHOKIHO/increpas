package set_get07;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person();
	
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setPhone("010-111-2222");
		
		p1.showFriends();
		
	}

}
