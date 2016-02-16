package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	private AeroPorto p;

	public Gioco(AeroPorto p) {
		this.p = p;
	}
	
	public void attacco(Invasore invasori[]){
        for(Invasore inv: invasori){
            int potenzadifuoco = inv.potenzaFuoco();
            p.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
        }
    }
	
	public boolean portoDistrutto() {
		if(p.getDimensioneSqMetersNonDistrutta() <= 0 )
			return true;
		else 
			return false;
	}

}
