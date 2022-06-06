package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);

		var numA = Math.pow(6 * (3 + 2), 2);
		var numB = (1 - 5) * (2 - 7);

		var denA = 3 * 2;
		var denB = 2;

		var superiorA = numA / denA;
		var superiorB = Math.pow((numB / denB), 2);

		var superior = Math.pow((superiorA - superiorB), 3);
		var inferior = Math.pow(10, 3);
		
		var resultado = superior / inferior;
		
		System.out.println(resultado);
	}
}
