import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координаты 1-ой клетки: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("Введите координаты 2-ой клетки: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int deltaX = Math.abs(x1 - x2);
		int deltaY = Math.abs(y1 - y2);
		if(deltaX != 0 || deltaY != 0) {
			boolean canRookMove = deltaX == 0 || deltaY == 0;
			boolean canBishopMove = deltaX == deltaY;
			boolean canQueenMove = canRookMove || canBishopMove;
			boolean canKnightMove = (deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1);
			if(canRookMove) {
				System.out.println("Ладья может сделать ход");
			} else {
				System.out.println("Ладья не может сделать ход");
			}
			if(canBishopMove) {
				System.out.println("Слон может сделать ход");
			} else {
				System.out.println("Слон не может сделать ход");
			}
			if(canQueenMove) {
				System.out.println("Ферзь может сделать ход");
			} else {
				System.out.println("Ферзь не может сделать ход");
			}
			if(canKnightMove) {
				System.out.println("Конь может сделать ход");
			} else {
				System.out.println("Конь не может сделать ход");
			}
		} else {
			System.out.println("Ошибка. Вы ввели одну и ту же клетку");
		}
	}
}
