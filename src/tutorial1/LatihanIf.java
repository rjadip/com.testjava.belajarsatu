package tutorial1;

public class LatihanIf {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("The value of i is: %d\n", i);
			// System.out.println(" The value of i is: " + i );
		}

		int a = 10;
		int b = 20;
		int c = 30;

		System.out.println("a: " + a + " b: " + b + " c: " + c); // Tedious String Concatenation

		System.out.printf("a: %d b: %d c: %d\n", a, b, c); // Output using string formatting.
	}
}