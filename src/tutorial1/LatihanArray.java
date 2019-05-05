package tutorial1;

import java.util.Scanner;

public class LatihanArray {

	private static Scanner newScan;

	public static void main(String[] args) {
		int value = 7;

		int[] values;
		values = new int[9];

		System.out.println(value);
		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		values[3] = 40;
		values[4] = 50;
		values[5] = 60;
		values[6] = 70;
		values[7] = 80;
		values[8] = 90;

		System.out.println("Array #0 :" + values[0]);
		System.out.println("Array #0 :" + values[1]);
		System.out.println("Array #0 :" + values[2]);

		System.out.println("Jumlah Array (0-8) : ");
		newScan = new Scanner(System.in);

		int n = newScan.nextInt();
		if ((n >= 0) && (n <= 8)) {
			for (int i = n; i < values.length; i++) {
				System.out.println("Loop #1 array ke " + i + " " + values[i]);
			}
		} else {
			System.out.println("Array yang tersedia hanya 0 - 8 !");
		}

		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Loop #2 array ke " + i + " " + numbers[i]);
		}
	}
}