import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number");
		int num = s.nextInt();
		String str = Integer.toString(num);

		int[] a = new int[str.length()];

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] = str.charAt(str.length() - 1-i) - '0');
			//Subtracting '0' converts a numeric character to its actual integer value.

		}

	}

}
