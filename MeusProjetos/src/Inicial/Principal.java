package Inicial;

import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Calculo e = new Calculo();
		int n = 10;
		boolean x = e.ePrimo(n); // Descobre se é primo;
		List<Integer> lista = e.todosPrimos(n); // Descobre todos os primos abaixo de n;
		int y = e.quantosDividores(n);
		
		System.out.println("O numero " + n + " e primo ?");
		System.out.println(x);
		System.out.println("\nQuais numeros abaixo de " + n + " sao primos ?");
		System.out.println(lista);
		System.out.println("\nQuanto dividores " + n +" tem ?");
		System.out.println(y);

	}
}
