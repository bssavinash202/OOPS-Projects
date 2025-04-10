package OPPSTemp;

public class Kelvin extends Temperature {

	public Kelvin(double value) throws InvalidTemperatureException {
		super(value);
		
	}

	@Override
	public void validate() throws InvalidTemperatureException {
		if(value<0) {
			throw new InvalidTemperatureException("Kelvin can't be below 0K (absolute zero)");
		}
		
	}

	@Override
	public double toCelsius() {
		
		return value-273.15;
	}

	@Override
	public double toFah() {
		// TODO Auto-generated method stub
		return (value-273.15)*9/5 +32;
	}

	@Override
	public double toKelvin() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
