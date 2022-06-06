package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho V e V = Televisão de 50';
		// Trabalho V e F ou F e V = Televisão de 32';
		// Ou comprando 50' ou 32' a familia vai pro shopping tomar sorvete;
		// Trabalho F e F familia não vai para shopping;
		System.out.println("Verdadeiro e Falso");
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		System.out.printf("Televisão de 50 Polegadas foi comprada ? %b\n", trabalho1 && trabalho2);
		System.out.printf("Televisão de 32 Polegadas foi comprada ? %b\n", trabalho1 ^ trabalho2);
		System.out.printf("Família foi para o Shopping ? %b\n", trabalho1 || trabalho2);
		
		System.out.println("\nVerdadeiro e Verdadeiro");
		trabalho1 = true;
		trabalho2 = true;
		System.out.printf("Televisão de 50 Polegadas foi comprada ? %b\n", trabalho1 && trabalho2);
		System.out.printf("Televisão de 32 Polegadas foi comprada ? %b\n", trabalho1 ^ trabalho2);
		System.out.printf("Família foi para o Shopping ? %b\n", trabalho1 || trabalho2);

		System.out.println("\nFalso e Verdadeiro");
		trabalho1 = false;
		trabalho2 = true;
		System.out.printf("Televisão de 50 Polegadas foi comprada ? %b\n", trabalho1 && trabalho2);
		System.out.printf("Televisão de 32 Polegadas foi comprada ? %b\n", trabalho1 ^ trabalho2);
		System.out.printf("Família foi para o Shopping ? %b\n", trabalho1 || trabalho2);

		System.out.println("\nFalso e Falso");
		trabalho1 = false;
		trabalho2 = false;
		System.out.printf("Televisão de 50 Polegadas foi comprada ? %b\n", trabalho1 && trabalho2);
		System.out.printf("Televisão de 32 Polegadas foi comprada ? %b\n", trabalho1 ^ trabalho2);
		System.out.printf("Família foi para o Shopping ? %b\n", trabalho1 || trabalho2);

	}
}
