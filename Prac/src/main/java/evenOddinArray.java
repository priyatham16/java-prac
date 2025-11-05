import java.util.Scanner;

public class evenOddinArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		int[] a = new int[4];
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		for (int j = 0; j < a.length; j++) {

			if (a[j] % 2 == 0) {
				evencount++;
			}
			if (a[j] % 2 != 0) {
				oddcount++;
			}

		}

		System.out.println(evencount);
		System.out.println(oddcount);

	}

}
