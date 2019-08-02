package b13;

public class Hero extends Persona {

	public Hero(String name, int HP) {
		super(name, HP);
	}

	public boolean arrest(Persona p) {
		if ((p) instanceof Villain) {
			return true;
		} else {
			return false;
		}

	}
}
