package b12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] persone = { new Dipendente("Antonio", "Pontrelli", 15.6), new Dipendente("Silvia", "Decaro", 13.4),
				new Stagista("Emanuele", "Baldi", 12.3), new Stagista() };

		for (Persona persona : persone) {
			System.out.println(persona.toString());
		}
		
	}

}
