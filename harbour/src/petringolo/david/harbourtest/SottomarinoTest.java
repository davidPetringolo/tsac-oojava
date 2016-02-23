package petringolo.david.harbourtest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.harbour.*;

public class SottomarinoTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Sottomarino sottomarino = new Sottomarino();
		sottomarino.set_nArmamenti(2);
		sottomarino.set_stazza(3);
		System.out.println("Potenza di fuoco Sottomarino 'sotto': " + sottomarino.getFullDamage());
		assertEquals(6, (int)sottomarino.getFullDamage());
		
	}

}
