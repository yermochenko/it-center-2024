import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Играем в игру \"Камень-ножницы-бумага\"");
		System.out.println("Сделайте свой выбор:");
		System.out.println("1. камень,");
		System.out.println("2. ножницы,");
		System.out.println("3. бумага.");
		System.out.print("Введите число: ");
		Scanner scanner = new Scanner(System.in);
		int player = scanner.nextInt();
		Random r = new Random();
		int computer = r.nextInt(1, 4);
		if(player == computer) {
			System.out.println("ничья");
		} else if(player == 1) {
			if(computer == 2) {
				System.out.println("Вы выиграли");
			} else {
				System.out.println("Вы проиграли");
			}
		} else if(player == 2) {
			if(computer == 1) {
				System.out.println("Вы проиграли");
			} else {
				System.out.println("Вы выиграли");
			}
		} else if(player == 3) {
			if(computer == 1) {
				System.out.println("Вы выиграли");
			} else {
				System.out.println("Вы проиграли");
			}
		} else {
			System.out.println("Вы проиграли, потому что не поняли правила.");
		}
	}
}
