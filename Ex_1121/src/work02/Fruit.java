package work02;

public class Fruit {
	
	private String Name;
	
	public Fruit(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	

	@Override
	public String toString() {
	
		return getName();
	}

	
}


