package abstract02;

public class Protos extends Unit {

	public Protos(String name, int energy, boolean fly ) {
	
		super.name = name;
		super.energy = energy;
		super.fly =fly;
		
	}
	
	@Override
	public void decEnergy() {
		energy -= 1;

	}

}
