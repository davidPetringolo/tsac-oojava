package petringolo.david.commercialista;

public class GestioneIncasso {
	
	private Cliente[] clienti = new Cliente[100];
	private int nClienti = 0;

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	public void addCliente(Cliente cliente) {
		clienti[nClienti++] = cliente;
	}
	
	public int incassoTotale() {
		int somma = 0;
		for(int i = 0; i < nClienti; ++i) 
			somma += clienti[i].debito();
		
		return somma;
	}


}
