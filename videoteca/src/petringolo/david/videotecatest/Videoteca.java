package petringolo.david.videotecatest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.videoteca.*;

public class Videoteca {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//triste realtà
		Film starWars = new Film();
		starWars.set_titolo("Star Wars: chapter 8");
		starWars.set_regista("J J David Maranta");
		starWars.set_annoproduzione(2017);
		String[] attori = new String[]{"Claudia Trotta", "Sara Marangone", "Mattia Pettenuzzo", "Igor Vukajlovic", "Menis", "Tiri", "China", "Fabiana Messina", "Alberto Persano", "Tiziano Capp"};
		starWars.set_attori(attori);
		starWars.set_supporto(new Cassetta());
		starWars.get_supporto().set_giorniNoleggio(5);
		System.out.println(starWars.get_supporto().costoNoleggio());
		
		assertEquals(9, (int)starWars.get_supporto().costoNoleggio());
		
	}

}
