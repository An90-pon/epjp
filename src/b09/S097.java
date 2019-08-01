package b09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class S097 {
    public static void main(String[] args) {                                          // questi giochi servono a prendere sottoinsiemi
        NavigableSet<Integer> ns = aNavSet();
        System.out.println(ns);

        System.out.println("Eleven or more: " + ns.ceiling(11));
        System.out.println("Zero or less: " + ns.floor(0));

        System.out.println("More than -1: " + ns.higher(-1));
        System.out.println("Less than -1: " + ns.lower(-1));

        System.out.println("Poll the first element: " + ns.pollFirst());
        System.out.println("Poll the last element: " + ns.pollLast());
    
        System.out.println("Print the set in descending order");
        Iterator<Integer> it = ns.descendingIterator(); 							// qui non posso fare il foreach poichè ho ribaltato. Non tocco la collezione.
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("The set in descending order: " + ns.descendingSet());
    }

    private static NavigableSet<Integer> aNavSet() {
        return new TreeSet<Integer>(Arrays.asList(5, -3, -1, 12, 27, 5));
    }
}
