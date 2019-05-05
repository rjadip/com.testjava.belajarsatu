package tutorial1;

import java.util.Scanner;

public class LatihanDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.println("Enter a number: "); int value = scanner.nextInt();
		 * 
		 * while(value != 5) { System.out.println("Enter a number: "); value =
		 * scanner.nextInt(); }
		 */

		int value = 0;
		do {
			System.out.println("Guess the number: ");
			value = scanner.nextInt();
			while (value != 5) {
				System.out.println(value + " Wrong number!");
				break;
			}
		}

		while (value != 5);

		System.out.println("Got " + value);
	}

}
