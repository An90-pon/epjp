package b04;

public class S44ProvaStringMain {
	public static void main(String[] args) {
		
		String s1 = "Giustina";
	    String s2 =  "Alfio";
	    String result = s1.concat(s2);	
	    System.out.println(result);
	    
	    
	    String s3 = "Antonio Pontrelli";
	    String[] array = s3.split(" ");
	    System.out.println(array[1]);
	    
	    String s4 = "";
	    s4.isEmpty();
	    boolean result1 = s4.isEmpty();
	    System.out.println(result1);
	    
	    String s5 = "Antonio";
	    s5.trim();
	    System.out.println(s5.trim());
	    
	    String s6 = "Antonio";
	    s6.length();
	    int length = s6.length();
	    System.out.println(length);
	    
	    String s7 = "Antonio è scemo";
	    String modificata = (s7.replace("è", "era"));
	    System.out.println(modificata);
	    
	    String gfg2 = String.join("<", "My", "name", "is", "Antonio", "Pontrelli"); 
        System.out.println(gfg2);
        
        StringBuilder s9 = new StringBuilder();
        StringBuilder s10 = new StringBuilder(10);
        StringBuilder s12 = new StringBuilder("Antonio is dummy");
        System.out.println("La capacità della stringa:" + s12.capacity());
        //s9.append("ABC");
        
        //System.out.println("Dopo il rimpiazzo la stringa è:" + s12.replace(1 , 3, "gt"));
        //System.out.println(" " + s12.charAt(2) + "t");
        //System.out.println();
        //System.out.println(s12.reverse());
        
        s12.setLength(5);
        System.out.println(s12);
        
        System.out.println(s12.indexOf("A"));
        
        s12.setCharAt(6, 'r');
        System.out.println(s12);
        
        
        //System.out.println("La capacità della stringa è:" s9.capacity());
        //StringBuilder s11 = new StringBuilder(10);
        //System.out.println("La capacità della stringa:" + s11.capacity());
	}
}
