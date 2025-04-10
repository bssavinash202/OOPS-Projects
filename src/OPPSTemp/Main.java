package OPPSTemp;

public class Main {
	public static void main(String[] args) {
		try {
			Celcius c = new Celcius(-20);
			System.out.println(c.toCelsius());
			System.out.println(c.toFah());
			System.out.println(c.toKelvin());
			
			Fah f= new Fah(-3000);
			System.out.println(f.toCelsius());
			System.out.println(f.toFah());
			System.out.println(f.toKelvin());
			
			Kelvin k = new Kelvin(-20);
			System.out.println(k.toCelsius());
			System.out.println(k.toFah());
			System.out.println(k.toKelvin());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
