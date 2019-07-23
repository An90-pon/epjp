package b04.s38;

public class If {
    public static void main(String[] args) {
        //boolean condition = true;
    	//int a = 3;
        int a = 12;
        if (a < 0) {
            System.out.println("negativo");
        }
        else if(a > 0 && a < 100) {
        System.out.println("piccolo");
        if(a % 2 == 0) {
        	System.out.println("pari");
        }
        else {
        	System.out.println("dispari");
        	}       	
        }
        else {	
        System.out.println("grande");
        }
    }
}
