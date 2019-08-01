package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S095 {
    public static void main(String[] args) {
        List<Integer> list = aList();                   
        System.out.println(list);							//sulle collezioni è implementata già la toString(), quindi la restituisce in maniera già leggibile

        List<Integer> l2 = new ArrayList<>();				//questo è conveniente meno del metodo in fondo
        l2.add(12);
        l2.add(18);
        l2.add(-5);
        l2.add(-997);
        
        System.out.println("At index 2: " + list.get(2));					
        list.add(2, -997);													// alla posizione due aggiungi l'elemento -997
        System.out.println("Index of -997: " + list.indexOf(-997));			// aggiunge un nuovo elemento nella lista alla posizione due, tutti quelli dopo vengono scalati
        																	// l'array list crea per cui un nuovo spazio, perchè è dinamico.
        list.remove(3);
        list.set(3, 42);
        System.out.println(list);
    }

    private static List<Integer> aList() {
        return new ArrayList<Integer>(Arrays.asList(12, 18, -5, -2233));    // ho i miei valori li do in pasto ad ArrayList e ritorno il mio array list come lista perchè il metodo asList ritorna una lista fissa e modificabile
    }																		// mi viene prima creata una lista la passo al costruttore ArrayList che mi crea un oggetto, su cui ci posso fare quello che voglio. Ho l'oggetto originale e l'asList e poi la mia copia 
}																			// su cui faccio quello che voglio.
																			//