package petringolo.david.commercialistatest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.commercialista.*;

public class Commercialista {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		GestioneIncasso gestInc = new GestioneIncasso();
		Dipendente david = new Dipendente();
		david.set_nome("david");
		david.set_cognome("petringoolo");
		david.set_cF("PTRDVD96S07888GY");
		gestInc.addCliente(david);
		assertEquals(5000, gestInc.incassoTotale());
		LiberoProfessionista lb = new LiberoProfessionista();
		lb.set_nome("willi");
		lb.set_nFatture(10);
		gestInc.addCliente(lb);
		assertEquals(10500, gestInc.incassoTotale());
		Imprenditore impr = new Imprenditore();
		impr.set_nFatture(101);
		gestInc.addCliente(impr);
		assertEquals(60600, gestInc.incassoTotale());
		System.out.println("Incasso totale (in centesimi di euro): euro " + gestInc.incassoTotale());
		
	}

}
