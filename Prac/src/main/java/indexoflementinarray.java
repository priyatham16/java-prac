import java.util.Scanner;

public class indexoflementinarray {
	static Scanner s = new Scanner(System.in);

	public static int method(int[] a, int ele) {

		for (int j = 0; j < a.length; j++) {
			if (ele == a[j]) {
				return j;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println("enter array");
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("enter to be found element");
		int ele = s.nextInt();

		int indexis = method(a, ele);
		System.out.println(indexis);

	}

}
