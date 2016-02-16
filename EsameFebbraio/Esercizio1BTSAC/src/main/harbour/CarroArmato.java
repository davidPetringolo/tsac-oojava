package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore {

	private int missili;
	private int stazza;
	
	public int getMissili() {
		return missili;
	}
	public void setMissili(int missili) {
		this.missili = missili;
	}
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	
	@Override
    public int potenzaFuoco() {
        return Math.round(this.getMissili() * this.getStazza() * 0.3f);
    }
	
	
}
