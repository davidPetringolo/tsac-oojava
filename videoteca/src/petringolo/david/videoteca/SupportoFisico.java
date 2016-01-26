package petringolo.david.videoteca;

public class SupportoFisico {
	
	private String _nome;
	private double _costoIniziale;
	private int _giorniNoleggio;
	
	//GETTERS & SETTERS
	public String get_nome() {
		return _nome;
	}
	public void set_nome(String _nome) {
		this._nome = _nome;
	}
	public double get_costoIniziale() {
		return _costoIniziale;
	}
	public void set_costoIniziale(double _costoIniziale) {
		this._costoIniziale = _costoIniziale;
	}
	public int get_giorniNoleggio() {
		return _giorniNoleggio;
	}
	public void set_giorniNoleggio(int _giorniNoleggio) {
		this._giorniNoleggio = _giorniNoleggio;
	}
	
	//METHODS
	public double costoNoleggio() {
		return 0;
	}
	

}
