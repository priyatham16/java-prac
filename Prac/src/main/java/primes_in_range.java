import java.util.Scanner;

public class primes_in_range {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter range");

		int lowerrange = s.nextInt();
		int upperrange = s.nextInt();
		// prime number logic
		// first read all the numbers between lowerrange and upperrange
		// next check each number whether it is prime or not

		// logic to print the numbers between lowerrange and upperrange
		for (int i = lowerrange; i <= upperrange; i++) {

			// check if i is prime or not and print i if it's a prime
			if (i == 0 || i == 1) {
				continue;
			} else {

				int count = 0;

				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						count++;
					}

				}
				if (count == 2) {
					System.out.println(i);
				}

			}
		}

	}

}
