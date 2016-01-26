package petringolo.david.videoteca;

public class Film {
	
	private String _titolo;
	private String _regista;
	private int _annoproduzione;
	private String[] _attori = new String[10];
	private SupportoFisico _supporto;
	
	//GETTERS & SETTERS
	public String get_titolo() {
		return _titolo;
	}
	public void set_titolo(String _titolo) {
		this._titolo = _titolo;
	}
	public String get_regista() {
		return _regista;
	}
	public void set_regista(String _regista) {
		this._regista = _regista;
	}
	public int get_annoproduzione() {
		return _annoproduzione;
	}
	public void set_annoproduzione(int _annoproduzione) {
		this._annoproduzione = _annoproduzione;
	}
	public String[] get_attori() {
		return _attori;
	}
	public void set_attori(String[] _attori) {
		this._attori = _attori;
	}
	public SupportoFisico get_supporto() {
		return _supporto;
	}
	public void set_supporto(SupportoFisico _supporto) {
		this._supporto = _supporto;
	}
	
	

}
