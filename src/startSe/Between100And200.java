package startSe;

import java.util.Scanner;

public class Between100And200 {

	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		System.out.println("Digite um número:");
		int number = numb.nextInt();

		if (number >= 100 && number <= 200) {
			System.out.println("Number between 100 and 200");
		} else {
			System.out.println("Chosen number is: " + number);
		}
		numb.close();
	}

}
