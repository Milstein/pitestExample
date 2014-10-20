package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPitestExample {
	
	PitestExample example = new PitestExample();
	
	@Test
	public void testMathExample() {
		int expected = 0;
		
		for (int i = -5; i <= 5; i++) {
			for (int j = -5; j <= 5; j++) {
				assertEquals(expected, this.example.mathExample(1, 2));
			}
		}
	}

}
