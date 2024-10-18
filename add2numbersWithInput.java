package javaPrac;

import java.util.Scanner;

public class add2numbersWithInput {

	public static void main(String[] args) {

		int a, b, sum;

		Scanner s = new Scanner(System.in);
		System.out.println("enter a");
		a = s.nextInt();

		System.out.println("enter b");
		b = s.nextInt();

		sum = a + b;

		System.out.println(sum);
	}

}
