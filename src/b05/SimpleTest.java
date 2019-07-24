package b05;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void isEvenTrue() {
		Simple simple = new Simple();
		boolean result = simple.isEven(42);
		
	    assertTrue(result);
	}



@Test
void isEvenNot() {
	Simple simple = new Simple();
	boolean result = simple.isEven(43);
	
    assertFalse(result);
}

}
