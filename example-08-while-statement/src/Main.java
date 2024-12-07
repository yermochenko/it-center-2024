import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random random = new Random();
		int a, b, c, d;
		int n = 10, total = 0, right = 0;
		int t;
		while(n > 0) {
			System.out.printf("Осталось решить примеров: %d\n", n);
			total++;
			t = random.nextInt(1, 5);
			if(t == 1) {
				// сложение
				a = random.nextInt(1, 100);
				b = random.nextInt(1, 100 - a + 1);
				c = a + b;
				System.out.printf("%d + %d = ", a, b);
			} else if(t == 2) {
				// вычитание
				a = random.nextInt(2, 101);
				b = random.nextInt(1, a);
				c = a - b;
				System.out.printf("%d − %d = ", a, b);
			} else if(t == 3) {
				// умножение
				a = random.nextInt(1, 11);
				b = random.nextInt(1, 11);
				c = a * b;
				System.out.printf("%d × %d = ", a, b);
			} else {
				// деление
				c = random.nextInt(1, 11);
				b = random.nextInt(1, 11);
				a = c * b;
				System.out.printf("%d ÷ %d = ", a, b);
			}
			d = console.nextInt();
			if(c == d) {
				System.out.println("Правильно");
				n--;
				right++;
			} else {
				System.out.printf("Неправильно. Правильный ответ %d\n", c);
				n++;
			}
		}
		System.out.printf("Поздравляем. Всего правильно решено: %d из %d (%.2f%%)\n", right, total, 100.0 * right / total);
	}
}
