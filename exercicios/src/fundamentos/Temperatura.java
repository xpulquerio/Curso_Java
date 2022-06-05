package fundamentos;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		// (ºF - 32) x 5/9 = ºC
		double celsius;
		double fahrenheit;
		final int constante1 = 32;
		final double constante2 = 5.0/9;
		System.out.println("Digite o valor em Fahrenheit:");
		
		fahrenheit = ent.nextDouble();
		
		celsius = (fahrenheit - constante1) * constante2;
		
		System.out.println(fahrenheit+" em Celsius é: "+celsius);

	}
}
