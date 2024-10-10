import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("В электронной энциклопедии представлены материалы 4-ёх видов:");
		System.out.println("1. Видео");
		System.out.println("2. Аудио");
		System.out.println("3. Фото");
		System.out.println("4. Текст");
		System.out.println("\nВведите объём в байтах материалов каждого вида:");
		System.out.print("Видео: ");
		int video = scanner.nextInt();
		System.out.print("Аудио: ");
		int audio = scanner.nextInt();
		System.out.print("Фото : ");
		int photo = scanner.nextInt();
		System.out.print("Текст: ");
		int text = scanner.nextInt();
		int total = video + audio + photo + text;
		System.out.printf("\nОбщий объём энциклопедии: %.2f Мб\n", (double) total / 1024 / 1024);
		System.out.printf("Видео: %.2f%%\n", 100.0 * video / total);
		System.out.printf("Аудио: %.2f%%\n", 100.0 * audio / total);
		System.out.printf("Фото : %.2f%%\n", 100.0 * photo / total);
		System.out.printf("Текст: %.2f%%\n", 100.0 * text / total);
	}
}
