package b04;

public class S44Main {
	public static void main(String[] args) {
		String s = "Giustina";
		S44Chicken c1 = new S44Chicken(s);
		S44Chicken c2 = new S44Chicken();
		S44Chicken c3 = new S44Chicken("Giovanna", 484.92);
		S44Chicken c4 = new S44Chicken("Tom", 218.92, false);
		
		System.out.println(c4 + "\n" + c3);
		System.out.println(c1 + "\n" + c2);
	}

}
