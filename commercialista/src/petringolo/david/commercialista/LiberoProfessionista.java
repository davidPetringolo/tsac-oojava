package petringolo.david.commercialista;

public class LiberoProfessionista extends Cliente {
	
	private String _pIva;
	private int _nFatture;
	private int _ricaricoPerFattura = 50;
	
	//GETTERS & SETTERS
	public String get_pIva() {
		return _pIva;
	}
	public void set_pIva(String _pIva) {
		this._pIva = _pIva;
	}
	public int get_nFatture() {
		return _nFatture;
	}
	public void set_nFatture(int _nFatture) {
		this._nFatture = _nFatture;
	}
	public int get_ricaricoPerFattura() {
		return _ricaricoPerFattura;
	}
	public void set_ricaricoPerFattura(int _ricaricoPerFattura) {
		this._ricaricoPerFattura = _ricaricoPerFattura;
	}
	
	public int debito() {
		int quotaParcella = 5000;
		int p = get_parcella() + quotaParcella;
		return p + (_ricaricoPerFattura * _nFatture);
	}

}
