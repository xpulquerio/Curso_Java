package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//double a = 2.3;
		String s = "Bom dia, X";
		s = s.toUpperCase();
		System.out.println(s);
		s = s.replace("X", "Senhora");
		System.out.println(s);
		s = s.concat("!!!");
		System.out.println(s);
	}
}
