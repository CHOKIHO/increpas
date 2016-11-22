package work;

public class Fruit {
	
	private String Name;
	
	public Fruit(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
	
		return getName();
	}
	
	
}
