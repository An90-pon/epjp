package b12;

public class Dipendente extends Persona {
	//private double retribuzione;
	
	public Dipendente() {

	}


	public Dipendente(String nome, String cognome, double retribuzione) {
		super(nome, cognome);
		// this.setStipendio(stipendio);
		this.retribuzione = retribuzione;
	}

	

//	public void setStipendio(double stipendio) {
//		this.stipendio = stipendio;
//	}	
}
