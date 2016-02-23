package petringolo.david.harbour;

public class Aereo extends Invasore {
	
	private int _nArmamentiAlpha;
	private int _nArmamentiBeta;
	private int _pFAlpha = 10;
	private int _pFBeta = 25;
	
	//GETTERS & SETTERS
	public int get_nArmamentiAlpha() {
		return _nArmamentiAlpha;
	}
	public void set_nArmamentiAlpha(int nArmamentiAlpha) {
		this._nArmamentiAlpha = nArmamentiAlpha;
	}
	public int get_nArmamentiBeta() {
		return _nArmamentiBeta;
	}
	public void set_nArmamentiBeta(int nArmamentiBeta) {
		this._nArmamentiBeta = nArmamentiBeta;
	}
	public int get_pFAlpha() {
		return _pFAlpha;
	}
	public void set_pFAlpha(int pFAlpha) {
		this._pFAlpha = pFAlpha;
	}
	public int get_pFBeta() {
		return _pFBeta;
	}
	public void set_pFBeta(int pFBeta) {
		this._pFBeta = pFBeta;
	}
	
	//METHODS
	public double getFullDamage() {
		return ((_nArmamentiAlpha * _pFAlpha) + (_nArmamentiBeta * _pFBeta)); // * get_coefficienteFullDamage());
	}
	
	

}
