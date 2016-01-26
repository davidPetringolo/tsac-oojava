package petringolo.david.commercialista;

public class Dipendente extends Cliente {
	
	int quotaParcella = 5000;
	int p = get_parcella() + quotaParcella;
	
	//METHODS
	public int debito() {
		return p;
	}

}
