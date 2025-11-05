import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		int[] a = new int[5];
		int[] b = new int[5];
		char[] c = new char[5];
		char[] d = new char[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		for (int j = 0; j < a.length; j++) {

			System.out.println(b[j] = a[a.length - 1 - j]);

		}

		System.out.println("enter again");
		for (int i = 0; i < c.length; i++) {
			c[i] = s.next().charAt(0);
		}

		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j] = c[c.length - 1 - j]);
		}

	}

}
