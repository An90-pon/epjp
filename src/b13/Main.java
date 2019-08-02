package b13;

import java.util.ArrayList;
//import java.util.Collections;

public class Main {

	
//	public void action(Persona p1, Persona p2) {
//		if ((p1) instanceof Villain && (p2) instanceof Hero) {
//			p1.arrest();
//			jail.add(p2);
//		}
//	}
	
	
//	public void check(Persona p) {
//		if ((p) instanceof Villain) {
//			jail.add(p);
//		} else if ((p) instanceof Hero || (p) instanceof Villain && (p.HP > 0 && p.HP < 100)) {
//			alive.add(p);
//		} else if ((p) instanceof Hero || (p) instanceof Villain && (p.HP <= 0)) {
//			dead.add(p);
//		}
//	}

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		ArrayList<Persona> alive = new ArrayList<Persona>();
		ArrayList<Persona> dead = new ArrayList<Persona>();
		ArrayList<Persona> jail = new ArrayList<Persona>();
		ArrayList<Persona> persone = new ArrayList<Persona>();
		
		persone.add(new Villain("Bob", 100, 56));
		persone.add(new Villain("Jug", 100, 78));
		persone.add(new Hero("Jack", 100));
		persone.add(new Common("Mario", 100));
		persone.add(new Common("Kyra", 60));
//
		//for(Persona persone : persona) {
		
		
//			
	}

}
