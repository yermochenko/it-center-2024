public class Main {
	public static void main(String[] args) {
		/* ПРИМЕР ЦЕЛОЧИСЛЕННЫХ АРИФМЕТИЧЕСКИХ ОПЕРАЦИЙ */
		int m = 34;
		int n = 6;
		int k1 = m + n; // сложение
		System.out.printf("%d + %d = %d\n", m, n, k1);
		int k2 = m - n; // вычитание
		System.out.printf("%d - %d = %d\n", m, n, k2);
		int k3 = m * n; // умножение
		System.out.printf("%d * %d = %d\n", m, n, k3);
		int k4 = m / n; // целочисленное деление (с отбрасыванием остатка)
		System.out.printf("%d / %d = %d\n", m, n, k4);
		int k5 = m % n; // остаток от целочисленного деления
		System.out.printf("%d %% %d = %d\n", m, n, k5);

		/* ПРИМЕР ВЕЩЕСТВЕННЫХ АРИФМЕТИЧЕСКИХ ОПЕРАЦИЙ */
		double x = 43.2;
		double y = 7.8;
		double z1 = x + y; // сложение
		System.out.printf("%.1f + %.1f = %.1f\n", x, y, z1);
		double z2 = x - y; // вычитание
		System.out.printf("%.1f - %.1f = %.1f\n", x, y, z2);
		double z3 = x * y; // умножение
		System.out.printf("%.1f * %.1f = %.2f\n", x, y, z3);
		double z4 = x / y; // деление
		System.out.printf("%.1f / %.1f = %f\n", x, y, z4);
	}
}
