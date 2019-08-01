package b09;

import java.util.ArrayList;

public class My108 {
	public static ArrayList<Integer> join(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		int i = 0;
		int j = 0;
		ArrayList<Integer> joined = new ArrayList<Integer>();

		while (i < a1.size() && j < a2.size()) {

			if (a1.get(i) < a2.get(j)) {
				joined.add(a1.get(i));
				i++;
			} else {
				joined.add(a2.get(j));
				j++;
			}
		}
		
		if(i == a1.size() - 1) {
			
			for(j = 0; j < a2.size() - 1; j++) {
				 joined.add(a1.get(i));
			 }
			
			
		} else if(i == a2.size() - 1) {
			
			 for(i = 0; i < a1.size() - 1; j++) {
				 joined.add(a2.get(j));
			}	

		}
		return joined;
	}
}

		 
		 
		