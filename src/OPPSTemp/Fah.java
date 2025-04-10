package OPPSTemp;

public class Fah extends Temperature{
	Fah(double value) throws InvalidTemperatureException{
		super(value);
	}

	@Override
	public void validate() throws InvalidTemperatureException {
		if(value<-459.67) {
			throw new InvalidTemperatureException("fahrenheit can't be below -459.67°F (absolute zero)");
		}
		
	}

	@Override
	public double toCelsius() {
		
		return (value-32)*5/9;
	}

	@Override
	public double toFah() {
		
		return value;
	}

	@Override
	public double toKelvin() {
		
		return (value-32)*5/9 +273.15;
	}
}
