package tutorial1;

public class LatihanIf3 {
	public static void main(String[] args) {
		int loop = 0;

		while (true) {
			System.out.printf("Looping: " + loop + " ");

			if (loop == 5) {
				System.out.println("Stop! Loop = " + loop);
				break;

			}

			loop++;

			System.out.println("Running");
		}
	}
}
