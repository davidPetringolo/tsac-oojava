package petringolo.david.harbourtest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.harbour.Aereo;

public class AereoTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Aereo aereo = new Aereo();
		aereo.set_nArmamentiAlpha(2);
		aereo.set_nArmamentiBeta(2);
		
		System.out.println("Potenza di fuoco Aereo 'aereo': " + aereo.getFullDamage());
		assertEquals(70, (int)aereo.getFullDamage());
		//assertEquals(95, 0, areo.getFullDamage());
	}

}
