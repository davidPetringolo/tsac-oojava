package petringolo.david.commercialista;

public class Imprenditore extends Cliente {
	
	private String _pIva;
	private String _ragioneSociale;
	private int _nFatture;
	
	
	//GETTERS & SETTERS
	public String get_pIva() {
		return _pIva;
	}
	public void set_pIva(String _pIva) {
		this._pIva = _pIva;
	}
	public String get_ragioneSociale() {
		return _ragioneSociale;
	}
	public void set_ragioneSociale(String _ragioneSociale) {
		this._ragioneSociale = _ragioneSociale;
	}
	public int get_nFatture() {
		return _nFatture;
	}
	public void set_nFatture(int _nFatture) {
		this._nFatture = _nFatture;
	}
	
	public int debito() {
		if(_nFatture <= 100) 
			return 50000;
		else 
			return 50000 + ((_nFatture - 100) * 100);		//* 100 perchè sto gestendo tutto sottoforma di centesimi di euro	
	}

}
