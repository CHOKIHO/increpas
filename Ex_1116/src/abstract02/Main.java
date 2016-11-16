package abstract02;

public class Main {

	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		Terran t2 = new Terran("탱크", 200, false);

		t1.decEnergy();
		t2.decEnergy();
		System.out.println(t1.getEnergy() + "/" + t2.getEnergy());
		
		Zerg z1 = new Zerg("저글링", 100, false);
		Zerg z2 = new Zerg("뮤탈", 200, true);

		z1.decEnergy();
		z2.decEnergy();
		System.out.println(z1.getEnergy() + "/" + z2.getEnergy());
		
		Protos p1 = new Protos("광전사", 100, false);
		
		p1.decEnergy();
		System.out.println(p1.getEnergy());
		
	}
}
