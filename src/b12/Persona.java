package b12;

public class Persona {

	private static final double DEFAULT_RETRIBUZIONE = 0D;
	private static final String DEFAULT_NAME = "N/D";
	private static final String DEFAULT_SURNAME = "N/D";
	public double retribuzione;
	public String nome;
	public String cognome;

	public Persona() {
		this.nome = DEFAULT_NAME;
		this.cognome = DEFAULT_SURNAME;
		this.retribuzione = DEFAULT_RETRIBUZIONE;
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;

	}

	public String getName() {
		return nome;
	}

	public String getSurname() {
		return cognome;
	}

	public double getWage() {
		return retribuzione;
	}

	@Override
	public String toString() {
//		String result;
//		result = String.format("%n", "%s", "%d", nome, cognome, stipendio);
		return "Persona [" + nome + " " + cognome + " , " + retribuzione + "]";
	}

}