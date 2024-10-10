import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* ПРИМЕР ВВОДА ДАННЫХ С КЛАВИАТУРЫ */
		Scanner scanner = new Scanner(System.in); // Создание объекта для ввода с клавиатуры

		/* пример работы с целыми числами */
		System.out.print("Введите первое целое число: ");
		int a = scanner.nextInt();
		System.out.print("Введите второе целое число: ");
		int b = scanner.nextInt();
		int c = a + b;
		System.out.println(c);

		/* пример работы с целыми числами */
		System.out.print("Введите первое вещественное число: ");
		double x = scanner.nextDouble();
		System.out.print("Введите второе вещественное число: ");
		double y = scanner.nextDouble();
		double z = x + y;
		System.out.println(z);
	}
}
