package startSe.Vehicles;

import java.util.Scanner;

public class RunVehicles {
	static int countLess2000 = 0;
	static int countMore2000 = 0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char repeat = 's';


		while (repeat == 's' || repeat == 'S' ) {

			System.out.println("Informe o fabricante");
			String manufacturer = scanner.next();

			System.out.println("Informe o modelo");
			String model = scanner.next();

			System.out.println("Informe o ano");
			int year = scanner.nextInt();

			System.out.println("Informe o preço");
			float price = scanner.nextFloat();

			Vehicle vehicle = new Vehicle(manufacturer, model, year, price);

			
			Float discount = CalculateDiscount.main(vehicle);
			calcCount(vehicle);
			System.out.println("Desconto no valor de " + discount);
			System.out.println(". Valor a ser pago de R$" + (vehicle.getPrice() - discount));
			System.out.println("Veículos até 2000: " + countLess2000);
			System.out.println("Veículos após 2000: " + countMore2000);
			
			System.out.println("Deseja informar novo ve�culo? S - Sim / N - N�o");
			repeat = scanner.next().charAt(0);
		}
		scanner.close();
	}
	
	private static void calcCount(Vehicle vehicle) {
		if (vehicle.getYear() <= 2000) {
			countLess2000 = +1;
		} else {
			countMore2000 = +1;
		}
	}

}

