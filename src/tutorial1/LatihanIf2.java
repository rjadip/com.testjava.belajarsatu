package tutorial1;

import java.util.Scanner;

public class LatihanIf2 {
	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanInt2 = new Scanner(System.in);
		System.out.println("Masukkan bilangan bulat pertama ");
		int myInt = scanInt.nextInt();
		System.out.println("Masukkan bilangna bulat Kedua ");
		int myInt2 = scanInt2.nextInt();
		if (myInt < myInt2) {
			System.out.println("Condition1, angka pertama " + myInt + " lebih kecil daripada angka kedua " + myInt2);
		}

		else if (myInt > myInt2) {
			System.out.println("Condition2, angka pertama " + myInt + " lebih besar daripada angka kedua " + myInt2);
		}

		else if (myInt == myInt2) {
			System.out.println("Condition3, Baik angka pertama yaitu " + myInt + " dan kedua " + myInt2 + " sama");
		}
	}
}
