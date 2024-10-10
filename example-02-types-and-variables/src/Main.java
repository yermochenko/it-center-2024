import java.util.Date;

public class Main {
	public static void main(String[] args) {
		/* ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ */
		byte n1 = 123;  // Размер 1 байт  ( 8 бит).  Диапазон значений: [ -2⁷;  2⁷-1] или [-128; 127]
		System.out.println(n1);
		short n2 = 234; // Размер 2 байта (16 бит).  Диапазон значений: [-2¹⁵; 2¹⁵-1] или [-32'768; 32'767]
		System.out.println(n2);
		int n3 = 345;   // Размер 4 байта (32 бита). Диапазон значений: [-2³¹; 2³¹-1]
		System.out.println(n3);
		long n4 = 456;  // Размер 8 байт  (64 бита). Диапазон значений: [-2⁶³; 2⁶³-1]
		System.out.println(n4);
		float x1 = 123.09f; // Размер 4 байта
		System.out.println(x1);
		double x2 = 456.87; // Размер 8 байт
		System.out.println(x2);
		boolean b1 = true;
		System.out.println(b1);
		boolean b2 = false;
		System.out.println(b2);
		char c = '@';
		System.out.println(c);

		/* ССЫЛОЧНЫЕ ТИПЫ ДАННЫХ */
		String s1 = "Hello, World!!!";
		System.out.println(s1);
		System.out.println(s1.length());
		String s2 = null;
		System.out.println(s2);
		// System.out.println(s2.length()); // ОШИБКА NullPointerException
		Date d = new Date();
		System.out.println(d);
	}
}
