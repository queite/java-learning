package startSe;

import java.util.Scanner;

public class Prices {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float price;
		float cost;
		String productName;
		float totalPrice = 0;
		float totalCost = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println(" Digite o nome do produto:");
			productName = scanner.next();
			System.out.println(" Digite o custo do produto:");
			cost = scanner.nextFloat();
			System.out.println(" Digite o preço do produto:");
			price = scanner.nextFloat();

			totalPrice += price;
			totalCost += cost;

			System.out.println(productName + ":");
			if (cost < price) {
				System.out.println("Lucro de " + (price - cost));
				showInfo(cost, price, totalCost, totalPrice, i);
			} else if (cost == price) {
				System.out.println("Custo e preço são iguais");
				showInfo(cost, price, totalCost, totalPrice, i);
			} else {
				System.out.println("Prejuizo de " + (cost - price));
				showInfo(cost, price, totalCost, totalPrice, i);
			}
			System.out.println("------------------------------------");

		}
		scanner.close(); 
	}

	private static void showInfo(float cost, float price, float totalCost, float totalPrice, int i) {
		System.out.println("Custo: " + cost);
		System.out.println("Preço: " + price);
		System.out.println("Média de custo: " + (totalCost / (i + 1)));
		System.out.println("Média de preço: " + (totalPrice / (i +1)));
	}
}
