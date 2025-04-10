package OPPSTemp;

public class Celcius extends Temperature{

	public Celcius(double value) throws InvalidTemperatureException {
		super(value);
	}

	@Override
	public void validate() throws InvalidTemperatureException {
		if(value<-273.15) {
			throw new InvalidTemperatureException("Celsius can't be below -273.15°C (absolute zero)");
		}
		
	}

	@Override
	public double toCelsius() {
		return value;
	}

	@Override
	public double toFah() {
		return (value*(9/5)+32);
		
	}

	@Override
	public double toKelvin() {
		return value+273;
		
	}
	
}
