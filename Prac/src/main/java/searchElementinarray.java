import java.util.Scanner;

public class searchElementinarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter array");
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("enter search element");
		int ele = s.nextInt();
		boolean fuck = true;
		for (int j : a) {
			if (ele == j) {
				fuck = true;
			} else {
				fuck = false;
			}
		}
		if (fuck) {
			System.out.println("found");
		} else {
			System.out.println("off");
		}

	}

}
