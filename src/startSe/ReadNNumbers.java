package startSe;

import java.util.Scanner;

public class ReadNNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número ou 0 para sair");
		int choice;
		choice = scanner.nextInt();
		
		while (choice != 0) {
			if (choice % 2 == 0) {
				System.out.println(choice + " é um número positivo");
			} else {
				System.out.println(choice + " é um número impar");
			}
			System.out.println("Digite um número ou 0 para sair");
			choice = scanner.nextInt();
		}
		
		System.out.println("Saindo...");

		scanner.close();
	}

}
