package fundamentos;

import java.util.Scanner;
import java.util.Locale;
import javax.swing.JOptionPane;

public class DesafioConversao {
public static void main(String[] args) {
	Locale.setDefault(new Locale("pt", "BR"));

	Scanner entrada = new Scanner(System.in);
	
	String x1 = JOptionPane.showInputDialog("Digite o primeiro salário:");
	String x2 = JOptionPane.showInputDialog("Digite o segundo salário:");
	String x3 = JOptionPane.showInputDialog("Digite o terceiro salário:");
	
	x1 = x1.replace(",", ".");
	x2 = x2.replace(",", ".");
	x3 = x3.replace(",", ".");
	
	Double salario1 = Double.parseDouble(x1);
	Double salario2 = Double.parseDouble(x2);
	Double salario3 = Double.parseDouble(x3);
	
	double media = (salario1 + salario2 + salario3) / 3;
	
//	System.out.printf("A média dos salários %s, %s, %s é %.2lf\n", salario1, salario2, salario3, media);
	System.out.println(media);
}
}
