package fundamentos;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		int x = 1;
		System.out.println("Como executar um programan o Eclipse ? Ctrl + Shift + F11");
		String[] comentario = { "// comenta apenas uma linha", "/* */ comenta várias lihnas",
				"/** comenta no estilo JAVADOC", "System.out.println é usado para imprimir algo no console!",
				"Use jshell no prompt de comando para executar código no cmd!",
				"Declarar variáveis com 'VAR' pode ser feito em Java também",
				"Variaveis não primitivas tem métodos que podem ser usados com o ponto, por exemplo... .toUpperCase()",
				"Ctrl + Alt + down/up para duplicar linha no java", 
				"Alt + down/up para mover a linha no java",
				"Ctrl + Shift + O organiza tudo incluindo ou removendo imports necessarios",
				"Ctrl + Espaço completa tudo!"};

		while (x < comentario.length) {
			System.out.println(comentario[x]);
			x++;

		}

	}
}
