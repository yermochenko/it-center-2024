import by.vsu.itcenter.Account;
import by.vsu.itcenter.Bank;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Bank bank = new Bank();
		while(true) {
			bank.show();
			System.out.println("\nМЕНЮ:");
			System.out.println("1) Открыть счёт");
			System.out.println("2) Закрыть счёт");
			System.out.println("3) Пополнить счёт");
			System.out.print("\n> ");
			int choice = Integer.parseInt(console.nextLine());
			if(choice == 1) {
				System.out.print("Введите владельца счёта: ");
				String owner = console.nextLine();
				int n = bank.open(owner);
				bank.save();
				System.out.printf("Счёт успешно открыт.\nНомер счёта: %d\n", n);
			} else if(choice == 3) {
				System.out.print("Введите номер счёта: ");
				int n = Integer.parseInt(console.nextLine());
				Account account = bank.find(n);
				if(account != null) {
					System.out.println("Введите сумму...");
					System.out.print("рублей: ");
					int rubbles = Integer.parseInt(console.nextLine());
					System.out.print("копеек: ");
					int kopecks = Integer.parseInt(console.nextLine());
					int sum = rubbles * 100 + kopecks;
					account.setBalance(account.getBalance() + sum);
					bank.save();
					System.out.println("Баланс счёта успешно пополнен");
				} else {
					System.out.println("Счёта с таким номером не существует");
				}
			} else {
				System.out.println("Некорректный пункт меню");
			}
		}
	}
}
