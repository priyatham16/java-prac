import java.util.Scanner;

public class stringPalindrome {

	public static void main(String[] args) {
		System.out.println("enter you fucking string");
		Scanner s = new Scanner(System.in);

		char[] a = s.next().toCharArray();
		boolean is = true;

		for (int i = 0; i < a.length; i++) {

			if (a[i] != a[a.length - 1 - i]) {
				is = false;
				break;
			} 
		}
		if (is) {
			System.out.println("it's palindrome");
		} else {
			System.out.println("no");
		}

	}

}
