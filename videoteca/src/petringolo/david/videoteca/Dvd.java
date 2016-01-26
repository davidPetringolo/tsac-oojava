package petringolo.david.videoteca;

public class Dvd extends SupportoFisico {
	
	//CONTRUCTOR
	public Dvd() {
		set_costoIniziale(1.50);
	}
	
	//METHODS
	public double costoNoleggio() {
		double cI = get_costoIniziale();
		int gN = get_giorniNoleggio();
		
		if(gN == 1)
			return cI;
		else if(gN == 2)
			return cI * 2;
		else if(gN > 2)
			return (cI * 2) + (gN - 2) * 2; 
		else 
			return 0;
	}

}
