package petringolo.david.commercialista;

public class Cliente {		//integro il Dipendente ....... SCHERZAVO
	
	private String _nome;
	private String _cognome;
	private String _cF;
	private int _parcella;
	
	//GETTERS & SETTERS
	public String get_nome() {
		return _nome;
	}
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	public String get_cognome() {
		return _cognome;
	}
	public void set_cognome(String _cognome) {
		this._cognome = _cognome;
	}
	public String get_cF() {
		return _cF;
	}
	public void set_cF(String _cF) {
		this._cF = _cF;
	}
	public int get_parcella() {
		return _parcella;
	}
	public void set_parcella(int _parcella) {
		this._parcella = _parcella;
	}
	
	public int debito() {
		return 0;
	}
	

}
