package b09;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class My109 {
	private ArrayList<Integer> tabella = new ArrayList<Integer>(); //se la facessi statica tutti gli oggetti di questa classe lavoreranno su quella;
																	// qui è come se avessi fatto il costruttore;
	
	public void add(int a) {
		tabella.add(a);
	}

	public boolean check(int b) {

		if (tabella.contains(b)) {
			return true;
		} else
			return false;
	}

	public ArrayList<Integer> getData() {
		
		ArrayList<Integer> sortedtable = new ArrayList<Integer>();
		sortedtable.addAll(tabella);
		sortedtable.sort(null);
		return sortedtable;
		
	}

}
