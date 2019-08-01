package b10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class S110 {
    private static void printIntegerMethods() {
        Class<?> c = Integer.class;  //c è un oggetto che mi rappresenta la classe Integer
        Method[] methods = c.getMethods();   // vammi  a prendere tutti imetodi, mi faccio un array di methods e qui dentro ci sono tutti i metodi della classe integer
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void printDefaultArrayListCapacity() {
        ArrayList<Integer> al = new ArrayList<>();  
        al.add(1);

        try {
            Field field = ArrayList.class.getDeclaredField("elementData");    // vado in array list vammi a frendere tra i field quello che si chiama element data
            field.setAccessible(true);  // fammi diventare il metodo accessibile
            Object[] data = (Object[]) field.get(al);   // leggimi  
            System.out.println("My ArrayList has capacity " + data.length);
        } catch (NoSuchFieldException | SecurityException | IllegalAccessException e) {
            System.out.println("Couldn't get ArrayList capacity: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        printIntegerMethods();
        printDefaultArrayListCapacity();
    }
}
