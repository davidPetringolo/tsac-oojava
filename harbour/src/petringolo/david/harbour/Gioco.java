package petringolo.david.harbour;

public class Gioco {
	
	PortoNavale porto = new PortoNavale();
	
	//GETTERS & SETTERS
	public PortoNavale getporto() {
		return porto;
	}

	public void setporto(PortoNavale porto) {
		this.porto = porto;
	}

	//METHODS
	public void newSqaureMeters(Invasore[] invasori) {
		double inflictedDamages = 0;
		for(int i = 0; i < invasori.length; i++) 
			inflictedDamages += invasori[i].getFullDamage() * 1.5;
		porto.set_dimensione(porto.get_dimensione() - inflictedDamages);
	}
	
	public boolean isBreak() {
		if(porto.get_dimensione() <= 0 )
			return true;
		else 
			return false;
	}

}
/*
public class AeroPorto {
    private double dimensioneSqMeters;
    private double dimensioneSqMetersNonDistrutta;
    public double getDimensioneSqMeters() {
        return dimensioneSqMeters;
    }
    public void setDimensioneSqMeters(double dimensioneSqMeters) {
        this.dimensioneSqMeters = dimensioneSqMeters;
        this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
    }
    public double getDimensioneSqMetersNonDistrutta() {
        return dimensioneSqMetersNonDistrutta;
    }
    public void setDimensioneSqMetersNonDistrutta(int dimensioneSqMetersNonDistrutta) {
        this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
    }
    public void addMetriQuadriDistrutti(double dimensione) {
        dimensioneSqMetersNonDistrutta = 
                Math.max(dimensioneSqMetersNonDistrutta - dimensione, 0);
    }
}


public class Gioco {
    private AeroPorto aeroporto;

    public Gioco(AeroPorto p) {
        this.aeroporto = p;
    }
    
    public void attacco(Invasore invasori[]){
        for(Invasore inv: invasori){
            int potenzadifuoco = inv.potenzaFuoco();
            aeroporto.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
        }
    }
    
    public boolean portoDistrutto(){
        return aeroporto.getDimensioneSqMetersNonDistrutta() <= 0; 
    }
}


public class CarroArmato extends Invasore {
    private int stazza;
    private int missili;
    
    public int getStazza() {
        return stazza;
    }
    public void setStazza(int stazza) {
        this.stazza = stazza;
    }
    public int getMissili() {
        return missili;
    }
    public void setMissili(int missili) {
        this.missili = missili;
    }
    @Override
    public int potenzaFuoco() {
        return Math.round(missili * stazza * 0.3f);
    }
}

///////////


public class Main {

    public static void main(String[] args) {
        PressureSensor ps = new PressureSensor();
        MyListener listener = new MyListener();

        ps.setListener(listener);
        
        for(int i = 0; i < 1000; i++) {
            ps.next();
        }
        
        Map<Integer, Integer> errorMap = new HashMap<>();
        ArrayList<Double> dataList = new ArrayList<>();
        
        dataList = listener.getData();
        errorMap = listener.getErros();
        
        dataList.forEach((Double data) -> {
            System.out.println(data);
        });
        System.out.println("Numero rilevazioni correttamente effettuate: " + dataList.size());
        System.out.println("Valore massimo: " + listener.getMax());
        System.out.println("Valore medio: " + listener.getAvg());
        errorMap.forEach((Integer errorCode, Integer errorNumber) -> {
            System.out.println("Errore " + errorCode + ": " + errorNumber);
        });
    }
}
*/