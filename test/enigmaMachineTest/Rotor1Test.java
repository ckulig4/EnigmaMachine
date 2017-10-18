package enigmaMachineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import enigmaMachine.Rotor1;

public class Rotor1Test {

	@Test 
	public void validateRotorConversion() {
		Rotor1 rotor = new Rotor1("C");
		assertEquals(rotor.getValue(), "M");
	}

}
