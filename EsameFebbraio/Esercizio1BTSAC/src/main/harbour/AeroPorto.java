package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class AeroPorto {
	
	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	private double metriQuadriDistrutti;//????????????????????????
	
	public void addMetriQuadriDistrutti(double d) {
		dimensioneSqMetersNonDistrutta = Math.max(dimensioneSqMetersNonDistrutta - d, 0);
	}
	
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
	public void setDimensioneSqMetersNonDistrutta(double dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}
	
}
