package static03;

public class Guest {
	
	private String name;
	private String gender;
	
	public Guest(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
	
	public String getPoint() {
		return Guide.point;
	}
}
