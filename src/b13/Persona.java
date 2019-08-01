package b13;

public abstract class Persona {

	private int gunpower;
	private int HP;
	private String name;

	public Persona(String name, int HP) {
		this.name = name;
		this.HP = HP;
	}

	public boolean isAlive() {
		if (HP > 0) {
			return true;
		} else {
			return false;
		}
	}
//
//	public int changeEnergy(int HP, gunpower) {
//		int newHP = 0;
//		newHP = HP - gunpower;
//		return temp;
//	}
}
