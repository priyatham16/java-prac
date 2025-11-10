import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {

		String str = new String();
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		str = s.next();
		char[] c = str.toCharArray();
		char[] rev = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			rev[i] = c[c.length - 1 - i];

		}
		System.out.println(rev);

		System.out.println("enterr");
		String ip = s.next();
		char[] ipar = ip.toCharArray();

		int start = 0;
		int end = ipar.length - 1;

		for (int i = start, j = end; i < j; i++, j--)

		{
			char temp = ipar[i];
			ipar[i] = ipar[j];
			ipar[j] = temp;

		}

		while (start < end) {
			char temp = ipar[start];
			ipar[start] = ipar[end];
			ipar[end] = temp;

			start++;
			end--;

		}
		System.out.println(ipar);

	}

}
