import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("enter starting number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = 0;

		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println(c);

			a = b;
			b = c;

		}

	}

}
