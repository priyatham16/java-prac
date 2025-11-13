import java.util.Scanner;

public class stringcounter2 {

	public static void main(String[] args) {

		System.out.println("enterrrrrrr");
		Scanner s = new Scanner(System.in);
		char[] chrarr = s.next().toCharArray();
		int vowcount = 0;
		int conscount = 0;

		char[] vow = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < chrarr.length; i++) {
			boolean isvow = false;
			for (char c : vow) {
				if (chrarr[i] == c) {
					isvow = true;
					vowcount++;
					break;
				}
			}
			if (!isvow && chrarr[i] >= 'a' && chrarr[i] <= 'z') {
				conscount++;

			}

		}
		System.out.println(vowcount + " is the vowel count");
		System.out.println(conscount + " is the cons count");

	}

}
