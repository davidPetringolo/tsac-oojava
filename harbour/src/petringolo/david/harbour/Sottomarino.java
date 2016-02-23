package petringolo.david.harbour;

public class Sottomarino extends Invasore {
	
	private int _nArmamenti;
	private int _stazza;
	
	//GETTERS & SETTERS
	public int get_nArmamenti() {
		return _nArmamenti;
	}
	public void set_nArmamenti(int nArmamenti) {
		this._nArmamenti = nArmamenti;
	}
	public int get_stazza() {
		return _stazza;
	}
	public void set_stazza(int stazza) {
		this._stazza = stazza;
	}
	
	//METHODS
	public double getFullDamage() {
		return ((_nArmamenti * _stazza)); // * get_coefficienteFullDamage());
	}

}
