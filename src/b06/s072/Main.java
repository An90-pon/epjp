package b06.s072;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = {new Dog("A", 15.6), new Dog("B", 13.4), new Dog("C", 12.3)};
    	int i;
    	double tempspeed = dogs[0].getSpeed();
    	String tempname = dogs[0].getName();
    	
       // Dog tom = new Dog("Tom", 2.42);

        //String name = tom.getName();
        //double speed = tom.getSpeed();
        
       
        for(i = 0; i < dogs.length; i++) {
        	if(dogs[i].getSpeed() > tempspeed) {
        		tempspeed = dogs[i].getSpeed();
        		tempname = dogs[i].getName();
        	}
        	
        }
        System.out.println("Il cane più veloce è: " + tempname);

	//System.out.println("Name and speed: "+name+", "+speed);
	}
}