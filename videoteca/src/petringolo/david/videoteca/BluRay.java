package petringolo.david.videoteca;

public class BluRay extends SupportoFisico {
	
	//CONTRUCTOR
	public BluRay() {
		set_costoIniziale(1);
	}
	
	//METHODS
	public double costoNoleggio() {
		double cI = get_costoIniziale();
		int gN = get_giorniNoleggio();
		
		if(gN == 1)
			return cI;
		else if(gN > 1) {
			double costo = cI;
			for(int i = 1; i < gN; i++) 
				costo += (costo * 10) / 100;
			return costo;
		} else 
			return 0;
	}

}
