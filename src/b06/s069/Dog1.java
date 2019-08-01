package b06.s069;

public class Dog1 {
	private static final int DEFAULT_WEIGHT = 28;
	private static final String DEFAULT_NAME = "N/D";
	private int weight;
	private String name;
	
	
	public Dog1() {
		this.weight = DEFAULT_WEIGHT;
		this.name = DEFAULT_NAME;
	}

	public Dog1(String name) {
		this.weight = DEFAULT_WEIGHT;
		this.name = name;
	}

	public Dog1(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	@Override									// La to string posso mettere pure in barboncino
	public String toString() {
	String result;
	result = String.format("%s", name);
	return result;
	}
	
	
}
