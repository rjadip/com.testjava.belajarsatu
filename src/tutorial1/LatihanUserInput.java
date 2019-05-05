package tutorial1;

import java.util.Scanner;

public class LatihanUserInput {
	public static void main(String[] args) {
		// create scanner object
		Scanner scanInput = new Scanner(System.in);

		// output the prompt
		System.out.println("Enter a line of text: ");

		// wait for the user to enter a line of text
		double line = scanInput.nextDouble();

		// Tell them what they entered!
		System.out.println("You entered: " + line);
	}
}