import java.util.Scanner;

public class removeDuplicatesString {

	public static void main(String[] args) {
		System.out.println("enterrrrrrr");
		Scanner s = new Scanner(System.in);
		char[] chrarr = s.next().toCharArray();
		String resultstr = "";

		for (int i = 0; i < chrarr.length; i++) {
			boolean dup = false;
			for (int j = 0; j < i; j++) {

				if (chrarr[i] == chrarr[j]) {
					dup = true;
					break;
				}

			}

			if (dup == false) {
				resultstr = resultstr + chrarr[i];
			}

		}
		System.out.println(resultstr);

	}

}
