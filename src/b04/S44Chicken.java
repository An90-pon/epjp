package b04;

public class S44Chicken {
	static final double DEFAULT_WEIGHT = 1.0;
	static final String DEFAULT_NAME = "Unknown";
	String name;
    double weight;
    boolean female;
	 
	public S44Chicken(String name) {
		this.name = name; //mettere nell'oggetto corrente
		this.weight = DEFAULT_WEIGHT;
		this.female = true;
	}
	
	public S44Chicken(String name, double weight) {
		this.name = name; //mettere nell'oggetto corrente
		this.weight = weight;
	}
	
	public S44Chicken() {
		this.name = DEFAULT_NAME;
		this.weight = DEFAULT_WEIGHT;
	}
	
	public S44Chicken(String name, double weight, boolean female) {
		this.name = name; //mettere nell'oggetto corrente
		this.weight = weight;
		this.female = female;
	}

	@Override
	public String toString() {
//		return "S44Chicken [name=" + name + ", weight=" + weight + ", female=" + female + "]";
		
		String result; // = "[" + name + "," + weight + ","+ female +"]";
		
		result = String.format("%s, %.2f, %b", name, weight, female);
		
		return result;	
				
	}	
}

