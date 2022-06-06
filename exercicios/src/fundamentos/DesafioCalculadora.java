package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		String operacao = entrada.next();

		var resultadoSoma = operacao.equals("+") ? num1 + num2 : "operacao inválida";
		var resultadoSubtracao = operacao.equals("-") ? num1 - num2 : resultadoSoma;
		var resultadoMultiplicacao = operacao.equals("*") ? num1 * num2 : resultadoSubtracao;
		var resultadoDivisao = operacao.equals("/") ? num1 / num2 : resultadoMultiplicacao;
		var resultadoModulo = operacao.equals("%") ? num1 % num2 : resultadoDivisao;

	
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultadoModulo);
		entrada.close();

	}
}
