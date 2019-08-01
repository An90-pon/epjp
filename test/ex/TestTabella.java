package ex;

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class TestTabella {
	
	@Test
	void isElementHere() {
		ArrayList<Integer> actual = new ArrayList<>();
		actual.add(7);
		actual.add(5);
		//assertThat(actual.check(7), is(7));
		//assertThat(actual.check(5), is(5));
	}
	
	@Test
	void getDataTest() {
		
	}
	

}


