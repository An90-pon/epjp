package ex;

public class exampleForEach {

	public static void main(String[] args) {
		int k = 5;
		int[] values = { 1, 2, 3};
		for (int value : values) {
			value += k;
			System.out.println(value);						//questa è una copia del valore...quello che ho fatto qui dentro non ha alcun effetto. Non posso fare il ForEach, ho incrementato la copia, non il valore
		}													//tutto quello che faccio sulla copia è limitato allo scope. Tenendo conte che è un primitivo, non ci faccio nulla sull'originale. Se fosse stato un array di reference allora si. 
		for (int value : values){							//Per modificarli dovrei mettere il syso nel primo for. Infatti nel for successivo i valori sono ritornati quelli dell'array precedente.
			System.out.println(value);	
		}
	}
}
