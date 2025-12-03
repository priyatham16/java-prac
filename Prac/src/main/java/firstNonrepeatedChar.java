import java.util.Scanner;

public class firstNonrepeatedChar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter your string");
		String input = s.nextLine();
		char[] iparr = input.toCharArray();

		for (int i = 0; i < iparr.length; i++) {
			boolean m = false;
			for (int j = 0; j < iparr.length; j++) {
				if (j == i)

					continue;

				if (iparr[i] == iparr[j]) {
					m = true;
					break;
				}

			}

			if (!m) {
				System.out.println(iparr[i]);
				return;
			}

		}
		System.out.println("nothing");
	}

}
