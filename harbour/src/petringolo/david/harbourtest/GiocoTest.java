package petringolo.david.harbourtest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.harbour.*;

public class GiocoTest {

	@Test
	public void test() {
		
		//Sottomarino/i
		Sottomarino sottomarino = new Sottomarino();
		sottomarino.set_nArmamenti(5); 
		sottomarino.set_stazza(2);	
		
		//Aereo/i
		Aereo aereo = new Aereo();
		aereo.set_nArmamentiAlpha(1);	
		aereo.set_nArmamentiBeta(1);	
		
		
		//Gioco
		Gioco gioco = new Gioco();
		gioco.getporto().set_dimensione(124);	
		
		
		Invasore[] sotti = {sottomarino, aereo};
		
		int attackCounter = 0;
		
		while(!gioco.isBreak()) {
			gioco.newSqaureMeters(sotti);
			attackCounter++;
			System.out.println("Dimensione attuale Porto:" + gioco.getporto().get_dimensione());
		}
		
		System.out.println("Numero attacchi subiti: " + attackCounter);
		assertEquals(2, attackCounter);
		
		
		
	}

}
