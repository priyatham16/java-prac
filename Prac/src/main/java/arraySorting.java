import java.util.Scanner;

public class arraySorting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		int[] a = new int[6];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}
		for (int n : a) {
			System.out.println(n);
		}

	}

}
