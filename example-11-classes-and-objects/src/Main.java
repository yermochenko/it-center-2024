import java.util.Scanner;

public class Main {
	public static void output(Tamagotchi t) {
		if(t.alive) {
			String stage;
			if(t.age <= 10) {
				stage = "детство";
			} else if(t.age <= 20) {
				stage = "юность";
			} else if(t.age <= 30) {
				stage = "взрослая жизнь";
			} else {
				stage = "старость";
			}
			System.out.printf(
				"Тамагочи %s\n  возраст: %d дн. (%s)\n  энергия: %d / 200\n  счастье: %d / 20\n",
				t.name,
				t.age,
				stage,
				t.energy,
				t.happiness
			);
		} else {
			System.out.printf("Тамагочи %s мёртв\n", t.name);
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Tamagotchi tamagotchi = new Tamagotchi();
		System.out.print("Введите имя Вашего питомца: ");
		tamagotchi.name = console.nextLine();
		while(tamagotchi.alive) {
			output(tamagotchi);
			System.out.println("Действия:");
			System.out.println("1. Покормить.");
			System.out.println("2. Поиграть.");
			System.out.println("3. Погладить.");
			System.out.println("4. Закончить день.");
			System.out.print("Выберите действие: ");
			int action = console.nextInt();
			if(action == 1) {
				tamagotchi.feed();
			} else if(action == 2) {
				tamagotchi.play();
			} else if(action == 3) {
				tamagotchi.stroke();
			} else if(action == 4) {
				tamagotchi.spendDay();
			} else {
				System.out.println("Ошибка. Неправильное действие");
			}
		}
		output(tamagotchi);
	}
}
