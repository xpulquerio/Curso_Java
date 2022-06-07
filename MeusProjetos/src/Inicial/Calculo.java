package Inicial;
import java.util.List;
import java.util.ArrayList;

public class Calculo {

	public boolean ePrimo(int x) {
		int cont = 2;
		while (cont <= (x / 2)) {
			if (x % cont == 0) {
				return false;
			}
			cont++;
		}
		return true;
	}

	public double Soma(double x, double y) {
		return x + y;
	}

	public List<Integer> todosPrimos(int n) {
		Calculo e = new Calculo();
		List<Integer> lista = new ArrayList<Integer>();
		for (int j = 1; j <= n; j++) {
			if (e.ePrimo(j)) {
				lista.add(j);
			}
		}
		return lista;
	}
	
	public int quantosDividores (int x) {
		int cont = 0;
		for (int i = 1; i <= x; i++) {
			if(x%i == 0) {
				cont++;
			}
		}
		
		return cont;
	}

}
