package OPPSTemp;

public abstract class Temperature {
	protected double value;

	public Temperature(double value) throws InvalidTemperatureException {
		
		this.value = value;
		validate();
	}
	public abstract void validate() throws InvalidTemperatureException;
	
	public abstract double toCelsius();
	public abstract double toFah();
	public abstract double toKelvin();
	
	
	public double getValue() {
		return value;
	}
	
}
