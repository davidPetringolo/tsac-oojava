package petringolo.david.harbour;

public abstract class Invasore {
	
	private int _codiceI;
	private String _modello;
	private double _potenzaF;
	private double _coefficienteFullDamage = 1.5;
	
	//GETTERS & SETTERS
	public int get_codiceI() {
		return _codiceI;
	}
	public void set_codiceI(int codiceI) {
		this._codiceI = codiceI;
	}
	public String get_modello() {
		return _modello;
	}
	public void set_modello(String modello) {
		this._modello = modello;
	}
	public double get_potenzaF() {
		return _potenzaF;
	}
	public void set_potenzaF(double potenzaF) {
		this._potenzaF = potenzaF;
	}
	public double get_coefficienteFullDamage() {
		return _coefficienteFullDamage;
	}
	public void set_coefficienteFullDamage(double coefficienteFullDamage) {
		this._coefficienteFullDamage = coefficienteFullDamage;
	}
	
	
	//METHODS
	public abstract double getFullDamage();	//di fatto, il metodo ritorna il numero di m2 distrutti	

}
