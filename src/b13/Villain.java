package b13;

public class Villain extends Persona {

	protected int gunpower;

	public Villain(String name, int HP, int gunpower) {
		super(name, HP);
		this.gunpower = gunpower;
	}

	public void shoot(Persona p) {
		if((p) instanceof Hero || (p) instanceof Common) {
		p.changeEnergy(-gunpower);
		}
	}

}
