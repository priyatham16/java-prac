import java.util.Scanner;

public class occurances {

	public static void method(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean occurd = false;
			for (int k = 0; k < i; k++) {
				if (arr[k] == arr[i]) {
					occurd = true;
					break;
				}
			}
			if (occurd) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;
				}

			}
			System.out.println(arr[i] + ":" + count);

		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String ip = s.nextLine();
		char[] arr = ip.toCharArray();
		method(arr);
		s.close();

	}

}
