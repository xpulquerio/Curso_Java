package fundamentos.operadores;
import java.util.Scanner;
public class TipoStringEquals {
public static void main(String[] args) {
	System.out.println("2" == "2");
	
	String s = new String("2");
	System.out.println("2" == s);
	System.out.println("2".equals(s)); // Para comparar String comparar com .equals
	
	try (Scanner entrada = new Scanner(System.in)) {
		String s2 = entrada.nextLine(); //NextLine mantém os espaços, Next retira os espaços em branco.
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); //Trim para tirar os espaços em branco
	}
	
	
	
	
}
}
