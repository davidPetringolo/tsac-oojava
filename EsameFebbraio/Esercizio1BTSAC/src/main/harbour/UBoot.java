package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore {

	private int armaK;
	private int armaH;
	
	public int getArmaK() {
		return armaK;
	}
	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}
	public int getArmaH() {
		return armaH;
	}
	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}

	
	@Override
	public int potenzaFuoco() {
		return Math.round((this.getArmaK() * 20) + (this.getArmaH() * 30));
	}
	
	
}