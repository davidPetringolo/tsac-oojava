package petringolo.david.harbourtest;

import static org.junit.Assert.*;

import org.junit.Test;

import petringolo.david.harbour.*;

public class PortoNavaleTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		PortoNavale porto = new PortoNavale();
		porto.set_nome("Porto 01");
		porto.set_nImbarcazioni(15);
		porto.set_dimensione(4500);

		System.out.println("Nome del Porto: " + porto.get_nome());
		System.out.println("Imbarcazioni ormeggiate: " + porto.get_nImbarcazioni());
		System.out.println("Dimensione in metri quadri: " + porto.get_dimensione());

		
	}

}
