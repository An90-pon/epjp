package b09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class S094 {
    public static void main(String[] args) {
        Collection<Integer> coll = emptyCollection(); // Collection è solo una interfaccia, coll è infatti un reference

        coll.addAll(aCollection());  // Aggiunge tutti gli elementi di un'altra collection, ovvero col metodo in fondo al programma " a collection";
        System.out.println(coll);

        if (coll.contains(-2233)) {					//Questo metodo serve a vedere se c'è un elemento nella mia collezione, il primitivo viene davvero trasformato in reference type
            System.out.println("-2233 is there");
        }

        if (coll.equals(aCollection())) {				//Serve a capire se due collezioni sono uguali
            System.out.println("Same collection");
        }

        coll.add(42);										//
        if (!coll.equals(aCollection())) {					
            System.out.println("Different collection");
        }

        System.out.println("The collection has " + coll.size() + " elements"); //

        Iterator<Integer> it = coll.iterator();									// Adesso gli iteratori non sono più comodi da usare, si usa il foreach. sulla collezione chiamo il metodo iterator
        System.out.print("{ ");													//	un puntatore che mi lavora su tutti gli elementi. Il while: finchè l'iteratore ha un successore prendimi l'elemento next e stampamelo.
        while (it.hasNext()) {													// finchè arriviamo sull'ultimo non usciamo dal loop. L'iteratore è come se partisse da -1. Prima di fare il next devo fare l'asNext
            System.out.print(it.next() + " ");									// altrimenti incappo in una eccezione. Questo era il metodo tipicamente utilizzato.
        }
        
        System.out.println('}');

        for(Integer value : coll) {												// Questo pezzo di codice è equivalente a qauello di sopra. Questo è il preferito perchè non devo usare esplicitamente un iteratore.
        	System.out.println(value + " ");
        }
        
        
        coll.remove(-5);														//Anche qui entro un primitivo ma viene fatto il boxing auto
        Integer[] values = coll.toArray(new Integer[coll.size()]);
        System.out.println(Arrays.toString(values));
        
        coll.retainAll(aCollection());
        System.out.println(coll);
        
        coll.clear();
        System.out.println("Collection is empty? " + coll.isEmpty());
    }

    private static Collection<Integer> emptyCollection() {
        Collection<Integer> result = new ArrayList<Integer>(); //qui ho un costruttore di una collection ArrayList

        return result;
    }

    private static Collection<Integer> aCollection() {
        return Arrays.asList(12, 18, -5, -2233);               //analoga alla classe collection, è la classe che vado a vedere quando sono interessato ai metodi della classe di arrays
    }															// mi prende dei valori e me li trasforma in una lista di interi. Però mi ritorna un reference ad una lista. Poi la lista me la trasforma in una collection. Ricorda che il new va chiamato 
    															// solo su classi reali.
}																// List<Integer> list = new ArrayList<>() sullo heap ho un oggetto dove c'è una array list che avrà un reference. Mettimi l'indirizzo dentro list, che me me lo vede come. Array list è una classe concreta
																// che mi implementa l'interfaccia List. Se scrivessi ArrayList<Integer> potrei accedere alle funzionalità di ArrayList, mentre in List restringo la funzionalità.
																// se me li volessi tenere anche in ordine invece di ArrayList<> userei una struttura del tipo TreeSet(); in teoria converrebbe usare sempre collection ma se mi restringe troppo
																// avrò bisogno anche di altri metodi. Collection è per l'appunto la più less che ho. 
																// Normalmente c'è sempre il costruttore di default. Un'altra cosa è passare un array list come una copia di collezione. 
																// 	AsList è molto comoda per inizializzare dei valori.


