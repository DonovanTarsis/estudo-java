package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double grausCelsius;
		double grausFahrenheit;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		 
		grausFahrenheit = 95;
		grausCelsius = (grausFahrenheit - AJUSTE) * FATOR;
		System.out.printf("%.1fºF = %.1fºC\n", grausFahrenheit, grausCelsius);
		
		 
		grausFahrenheit = 32;
		grausCelsius = (grausFahrenheit - AJUSTE) * FATOR;
		System.out.printf("%.1fºF = %.1fºC\n", grausFahrenheit, grausCelsius);
	}
}
