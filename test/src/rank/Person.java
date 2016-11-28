package rank;

import java.io.Serializable;

public class Person implements Serializable{
	String name;
	int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public Person() {
		super();
	
	
	}

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {

		return "아이디 " + name + "나이 : " +age;
	}
	

	
}


