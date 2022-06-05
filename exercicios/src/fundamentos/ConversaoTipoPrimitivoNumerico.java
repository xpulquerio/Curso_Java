package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; //implícita
		System.out.println(a);
		
		float b = (float) 1.0; //explítica (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explítica (CAST)
		System.out.println(d);
		
		double e = 1.3123123;
		int f = (int) e; //explítica (CAST)
		System.out.println(f);
	}
}
