import java.util.Scanner;

public class Main {
	public static boolean ask(String question) {
		Scanner console = new Scanner(System.in);
		System.out.println(question);
		System.out.println("1. Да");
		System.out.println("2. Нет");
		System.out.print("> ");
		int choice = console.nextInt();
		if(choice != 1 && choice != 2) {
			throw new RuntimeException("Введено неверное число (ожидалось 1 или 2)");
		}
		return choice == 1;
	}

	public static void main(String[] args) {
		boolean yesAnswer;
		yesAnswer = ask("Хотите ли Вы быть всегда в гуще сражения?");
		if(yesAnswer) {
			// персонаж ближнего боя
			yesAnswer = ask("Предпочитаете защиту?");
			if(yesAnswer) {
				System.out.println("Ваш класс - гном");
			} else {
				System.out.println("Ваш класс - варвар");
			}
		} else {
			// персонаж дальнего боя
			yesAnswer = ask("Предпочитаете оказывать поддержку?");
			if(yesAnswer) {
				// персонаж поддержки
				yesAnswer = ask("Вы вредный?");
				if(yesAnswer) {
					System.out.println("Ваш класс - шаман");
				} else {
					System.out.println("Ваш класс - друид");
				}
			} else {
				// персонаж дальнего урона
				yesAnswer = ask("Любите магию?");
				if(yesAnswer) {
					System.out.println("Ваш класс - маг");
				} else {
					System.out.println("Ваш класс - эльф");
				}
			}
		}
	}
}
