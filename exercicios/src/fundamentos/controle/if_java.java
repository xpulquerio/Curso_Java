package fundamentos.controle;

import java.util.Scanner;

public class if_java {
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Informe a média: ");
			double media = entrada.nextDouble();
			
			if(7.0 <= media && media <= 10) {
				System.out.println("Aprovado");
				System.out.println("Parabéns!!!");
			}
			
			if(4.5 <= media && media < 7) {
				System.out.println("Recuperação");
			}
			
			if(0 <= media && media < 4.5) {
				System.out.println("Reprovado");
			}
		}
	}
}
