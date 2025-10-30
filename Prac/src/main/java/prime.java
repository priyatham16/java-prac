import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter");

		int a = s.nextInt();

		int count = 0;

		if (a == 0 || a == 1) {
			System.out.println("no");
		} else {
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					count++;
				}
			}

			if (count == 2)
				System.out.println("yes");

			else
				System.out.println("no");

		}

		System.out.println("enter");
		int b = s.nextInt();

		boolean prime = true;

		if (b == 0 || b == 1) {
			prime = false;
		}

		else {
			for (int i = 2; i <= b / 2; i++) {

				if (b % i == 0) {
					prime = false;
					break;
				}

			}

		}

		if (prime) {
			System.out.println("yeah");
		} else {
			System.out.println("noo");
		}

	}

}
