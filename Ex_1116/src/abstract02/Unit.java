package abstract02;

abstract public class Unit {
	
	String name;
	int energy;
	boolean fly;

	//체력감소 메서드
	//유닛마다 감소량이 다름 
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
}
