package petringolo.david.videoteca;

public class Cassetta extends SupportoFisico {
	
	//CONTRUCTOR
	public Cassetta(){
		set_costoIniziale(1);
	}
	//METHODS
	public double costoNoleggio() {
		double cI = get_costoIniziale();
		int gN = get_giorniNoleggio();
		
		if(gN == 1)
			return cI;
		else if (gN > 1)
			return cI + ((gN - 1) * 2);
		else 
			return 0;
	}

}
