import java.util.Scanner;

public class arraycopy {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		int[] a = new int[5];
		int[] b = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		for (int j = 0; j < a.length; j++) {

			System.out.println(b[j] = a[j]);

		}

	}

}
