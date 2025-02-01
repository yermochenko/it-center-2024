import java.util.Scanner;

public class Main {
	public static int ask(String question, String ... answers) {
		Scanner console = new Scanner(System.in);
		System.out.println(question);
		if(answers.length < 2) {
			answers = new String[] {"Да", "Нет"};
		}
		int i = 0;
		while(i < answers.length) {
			System.out.printf("%d. %s\n", i + 1, answers[i]);
			i++;
		}
		System.out.print("> ");
		int choice = console.nextInt();
		if(choice < 1 || choice > answers.length) {
			throw new RuntimeException("Введено неверное число (ожидалось значение между 1 и " + answers.length + ")");
		}
		return choice;
	}

	public static void main(String[] args) {
		int answer;
		answer = ask("Хотите ли Вы быть всегда в гуще сражения?");
		if(answer == 1) {
			// персонаж ближнего боя
			answer = ask("Предпочитаете защиту?");
			if(answer == 1) {
				System.out.println("Ваш класс - гном");
			} else {
				System.out.println("Ваш класс - варвар");
			}
		} else {
			// персонаж дальнего боя
			answer = ask("Предпочитаете оказывать поддержку?");
			if(answer == 1) {
				// персонаж поддержки
				answer = ask("Вы вредный?");
				if(answer == 1) {
					System.out.println("Ваш класс - шаман");
				} else {
					System.out.println("Ваш класс - друид");
				}
			} else {
				// персонаж дальнего урона
				answer = ask("Любите использовать магию?", "Да", "Иногда", "Нет");
				if(answer == 1) {
					System.out.println("Ваш класс - маг");
				} else if(answer == 2) {
					System.out.println("Ваш класс - эльф");
				} else {
					System.out.println("Ваш класс - амазонка");
				}
			}
		}
	}
}
