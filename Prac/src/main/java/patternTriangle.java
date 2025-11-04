import java.util.Scanner;

public class patternTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		int row = s.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}

	}

}
