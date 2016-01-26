package petringolo.david.commercialista;

public class GestioneIncasso {
	
	private Cliente[] _clienti = new Cliente[100];
	private int _nClienti = 0;

	public Cliente[] get_clienti() {
		return _clienti;
	}

	public void set_clienti(Cliente[] _clienti) {
		this._clienti = _clienti;
	}
	
	public void addCliente(Cliente _cliente) {
		_clienti[_nClienti++] = _cliente;
	}
	
	public int incassoTotale() {
		int somma = 0;
		for(int i = 0; i < _nClienti; ++i) 
			somma += _clienti[i].debito();
		
		return somma;
	}


}
