package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos numéricos inteiros

		byte anosDeEmpresa = 23;
		short numeroDeVoos = 52;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// Tipo Booleano
		boolean estaDeFerias = false; // true

		// Tipo caractere
		char status = 'A'; // ativo

		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);

	}
}
