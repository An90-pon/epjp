package b13;

public abstract class Persona {

	public int HP;
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

	public void changeEnergy(int gunpower) {
		this.HP += gunpower;
	}

	public String getName() {
		return name;
	}
}
